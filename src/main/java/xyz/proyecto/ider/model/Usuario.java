package xyz.proyecto.ider.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {
	
	@Id
	@Column(nullable = false, unique = true)
	private int idusuario;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String pass;
	
	@Column(nullable = false)
	private String rol;
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Survey> surveys;
	

	public Usuario() {
		super();
	}

	public Usuario(int idusuario, String email, String pass, String rol, Set<Survey> surveys) {
		super();
		this.idusuario = idusuario;
		this.email = email;
		this.pass = pass;
		this.rol = rol;
		this.surveys = surveys;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Set<Survey> getSurveys() {
		return surveys;
	}

	public void setSurveys(Set<Survey> surveys) {
		this.surveys = surveys;
	}
	
}
