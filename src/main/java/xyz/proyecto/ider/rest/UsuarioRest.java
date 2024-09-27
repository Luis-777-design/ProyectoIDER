package xyz.proyecto.ider.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.proyecto.ider.model.Usuario;
import xyz.proyecto.ider.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioRest {

	@Autowired
	private UsuarioService usuarioService;
	
	  @GetMapping
	    public ResponseEntity<List<Usuario>> getAllUsuarios() {
	        return ResponseEntity.ok(usuarioService.findAll());
	    }

	  @GetMapping("/{id}")
	    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Integer id) {
	        Optional<Usuario> usuario = usuarioService.findById(id);
	        return usuario.map(ResponseEntity::ok) 
	                      .orElseGet(() -> ResponseEntity.notFound().build());
	    }
	  
	  @PostMapping
	    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
	        try {
	            Usuario savedUsuario = usuarioService.save(usuario);
	            return ResponseEntity.status(HttpStatus.CREATED).body(savedUsuario);
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	        }
	
	  }  
	}
