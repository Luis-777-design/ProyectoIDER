package xyz.proyecto.ider.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "opcion")
@Data
public class Opcion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idopcion", nullable = false)
	private int idopcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idquestion", nullable = false)
	private Question question;
	
	@Column(nullable = false)
	private boolean isselect;

	public Opcion() {
		super();
	}

	public Opcion(int idopcion, Question question, boolean isselect) {
		super();
		this.idopcion = idopcion;
		this.question = question;
		this.isselect = isselect;
	}

	public int getIdopcion() {
		return idopcion;
	}

	public void setIdopcion(int idopcion) {
		this.idopcion = idopcion;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public boolean isIsselect() {
		return isselect;
	}

	public void setIsselect(boolean isselect) {
		this.isselect = isselect;
	}
	
}
