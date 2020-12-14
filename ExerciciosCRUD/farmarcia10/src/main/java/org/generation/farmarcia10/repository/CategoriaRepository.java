package org.generation.farmarcia10.repository; 

import java.util.List;

import org.generation.farmarcia10.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

	public List<CategoriaModel> findBydescricaoContainingIgnoreCase (String descricao);
	
	
	
}
