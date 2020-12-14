package com.minhaEscola.minhaEscola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaEscola.minhaEscola.model.aluno;
import com.minhaEscola.minhaEscola.repository.alunoRepository;

@RestController
@RequestMapping("/aluno")
@CrossOrigin("*")
public class alunoController {
	
	@Autowired
	private alunoRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<aluno>> GetAll(){
		
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	
	@GetMapping("/{id]")
	public ResponseEntity<aluno> getById(@PathVariable long id){
		
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
				
		
	}
	
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<aluno>> GetByAluno(@PathVariable String nome){
		
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	
	
	@PostMapping
	public ResponseEntity<aluno> post (@RequestBody aluno nome){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(nome));
	}
	
	
	@PutMapping
	public ResponseEntity<aluno> put (@RequestBody aluno nome){
		
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(nome));
	}
	
	
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		
		repository.deleteById(id);
		
	}
	
	

}
