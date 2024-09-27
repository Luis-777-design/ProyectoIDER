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
@Table(name = "report")
@Data
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idreport", nullable = false)
	private int idreport;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idsurvey", nullable = false)
	private Survey surveys;
	
	@Column(nullable = false)
	private String stadistic;

	public Report() {
		super();
	}

	public Report(int idreport, Survey surveys, String stadistic) {
		super();
		this.idreport = idreport;
		this.surveys = surveys;
		this.stadistic = stadistic;
	}

	public int getIdreport() {
		return idreport;
	}

	public void setIdreport(int idreport) {
		this.idreport = idreport;
	}

	public Survey getSurveys() {
		return surveys;
	}

	public void setSurveys(Survey surveys) {
		this.surveys = surveys;
	}

	public String getStadistic() {
		return stadistic;
	}

	public void setStadistic(String stadistic) {
		this.stadistic = stadistic;
	}
	
}
