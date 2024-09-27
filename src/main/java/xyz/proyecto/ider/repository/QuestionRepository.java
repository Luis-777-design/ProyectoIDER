package xyz.proyecto.ider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.proyecto.ider.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
