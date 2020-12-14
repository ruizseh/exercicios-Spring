package org.generation.farmarcia10.repository;

import java.util.List;

import org.generation.farmarcia10.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	
	
	

}
