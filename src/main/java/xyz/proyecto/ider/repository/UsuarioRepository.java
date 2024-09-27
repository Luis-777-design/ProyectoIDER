package xyz.proyecto.ider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.proyecto.ider.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
