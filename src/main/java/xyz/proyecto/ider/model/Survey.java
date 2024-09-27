package xyz.proyecto.ider.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "survey")
@Data
public class Survey {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idsurvey", nullable = false, unique = true)
	private int idsurvey;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private String creationdate;
	
	@Column(nullable = false)
	private String finishdate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idusuario", nullable = false)
	private Usuario usuario;
	
	@OneToMany(mappedBy = "survey", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Question> questions;
	
	

	public Survey() {
		super();
	}

	public Survey(int idsurvey, String title, String description, String creationdate, String finishdate,
			Usuario usuario, Set<Question> questions) {
		super();
		this.idsurvey = idsurvey;
		this.title = title;
		this.description = description;
		this.creationdate = creationdate;
		this.finishdate = finishdate;
		this.usuario = usuario;
		this.questions = questions;
	}

	public int getIdsurvey() {
		return idsurvey;
	}

	public void setIdsurvey(int idsurvey) {
		this.idsurvey = idsurvey;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public String getFinishdate() {
		return finishdate;
	}

	public void setFinishdate(String finishdate) {
		this.finishdate = finishdate;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	
}
