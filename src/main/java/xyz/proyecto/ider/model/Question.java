package xyz.proyecto.ider.model;

import java.util.List;

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
@Table(name = "question")
@Data
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idquestion", nullable = false, unique = true)
	private int idquestion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idsurvey", nullable = false)
	private Survey survey;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idsurveysection", nullable = false)
	private Surveysection surveysection;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idresponse", nullable = false)
	private Response response;
	
	@Column(nullable = false)
	private String question;
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Opcion>opciones;

	public Question() {
		super();
	}

	public Question(int idquestion, Survey survey, Surveysection surveysection, Response response, String question,
			List<Opcion> opciones) {
		super();
		this.idquestion = idquestion;
		this.survey = survey;
		this.surveysection = surveysection;
		this.response = response;
		this.question = question;
		this.opciones = opciones;
	}

	public int getIdquestion() {
		return idquestion;
	}

	public void setIdquestion(int idquestion) {
		this.idquestion = idquestion;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public Surveysection getSurveysection() {
		return surveysection;
	}

	public void setSurveysection(Surveysection surveysection) {
		this.surveysection = surveysection;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Opcion> getOpciones() {
		return opciones;
	}

	public void setOpciones(List<Opcion> opciones) {
		this.opciones = opciones;
	}
}
