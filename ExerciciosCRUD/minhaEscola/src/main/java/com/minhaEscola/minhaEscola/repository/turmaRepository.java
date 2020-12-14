package com.minhaEscola.minhaEscola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.minhaEscola.minhaEscola.model.turma;
import java.util.List;



public interface turmaRepository extends JpaRepository<turma, Long> {
	
	public List<turma>findAllByTurmaContainingIgnoreCase(String turma);

}
