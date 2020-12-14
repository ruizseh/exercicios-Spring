package com.minhaEscola.minhaEscola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaEscola.minhaEscola.model.aluno;

public interface alunoRepository extends JpaRepository<aluno, Long>{

	public List<aluno>findAllByNomeContainingIgnoreCase(String nome);
	
	
}
