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
@Table(name = "response")
@Data
public class Response {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idresponse", nullable = false, unique = true)
	private int idresponse;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idusuario", nullable = false)
	private Usuario usarios;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idsurvey", nullable = false)
	private Survey surveys;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idquestion", nullable = false)
	private Question questions;
	
	@Column(nullable = false)
	private String answers;
	
	public Response() {
		super();
	}

	public Response(int idresponse, Usuario usarios, Survey surveys, Question questions, String answers) {
		super();
		this.idresponse = idresponse;
		this.usarios = usarios;
		this.surveys = surveys;
		this.questions = questions;
		this.answers = answers;
	}

	public int getIdresponse() {
		return idresponse;
	}

	public void setIdresponse(int idresponse) {
		this.idresponse = idresponse;
	}

	public Usuario getUsarios() {
		return usarios;
	}

	public void setUsarios(Usuario usarios) {
		this.usarios = usarios;
	}

	public Survey getSurveys() {
		return surveys;
	}

	public void setSurveys(Survey surveys) {
		this.surveys = surveys;
	}

	public Question getQuestions() {
		return questions;
	}

	public void setQuestions(Question questions) {
		this.questions = questions;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}
	
}
