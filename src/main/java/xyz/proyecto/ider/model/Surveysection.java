package xyz.proyecto.ider.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "surveysection")
@Data
public class Surveysection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idsection", nullable = false, unique = true)
	private int idsection;
	
	@Column(nullable = false)
	private String title;
	
	

	public Surveysection() {
		super();
	}

	public Surveysection(int idsection, String title) {
		super();
		this.idsection = idsection;
		this.title = title;
	}

	public int getIdsection() {
		return idsection;
	}

	public void setIdsection(int idsection) {
		this.idsection = idsection;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
