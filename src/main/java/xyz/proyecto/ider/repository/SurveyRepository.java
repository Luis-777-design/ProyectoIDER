package xyz.proyecto.ider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.proyecto.ider.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {

}
