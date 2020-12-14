package org.generation.farmarcia10.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table (name = "tb_categoria")
public class CategoriaModel {

	
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@NotBlank
	@Size  (min = 3, max = 200)
	private String descricao;
	
	
	@NotNull
	private boolean ativo;
	
	@OneToMany (mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties ("categoria")
	private List<Produto> produto;
	
	
	
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public boolean isAtivo() {
		return ativo;
	}



	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	public List <Produto> getProduto() {
		return produto;
	}



	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
	
	
}