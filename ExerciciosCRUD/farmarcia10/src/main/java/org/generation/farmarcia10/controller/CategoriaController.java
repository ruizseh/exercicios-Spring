package org.generation.farmarcia10.controller;

import java.util.List;

import org.generation.farmarcia10.model.CategoriaModel;
import org.generation.farmarcia10.repository.CategoriaRepository;
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

@RestController
@RequestMapping("/categoria")
@CrossOrigin(value = "*", allowedHeaders = "*")



public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
		
		
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel> GetById(@PathVariable long id){
		
		return repository.findById(id).map(rasp -> ResponseEntity.ok(rasp)).orElse(ResponseEntity.notFound().build());
		
	}
	
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<CategoriaModel>> GetByDescricao(@PathVariable String descricao){
		
		return ResponseEntity.ok(repository.findBydescricaoContainingIgnoreCase(descricao));
		
		
	}
	
	
	@PostMapping
	public ResponseEntity<CategoriaModel> post (@RequestBody CategoriaModel descricao){
		
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(descricao));
		
		
	}
	
	@PutMapping
	public ResponseEntity<CategoriaModel> put (@RequestBody CategoriaModel descricao){
		
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(descricao));
	}
	
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		
		repository.deleteById(id);
		
	}
	
	
	
}
