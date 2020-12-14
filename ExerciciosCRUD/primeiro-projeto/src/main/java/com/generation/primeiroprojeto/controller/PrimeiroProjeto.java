package com.generation.primeiroprojeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping 

public class PrimeiroProjeto {
	
	
	@GetMapping ("/orientacaodetalhes")
	public String OrientacaoDetalhes() {
		
		return "Ficar atento aos pequnos detalhes se faz muito importante, pois temos que seguir passo a passo, e qualuqer erro e destração,"
				+ "implicará no desenvilvimento da aplicação.";
		
		
	}
	
	@GetMapping ("/trabalhoequipe")
	public String TrabalhoEquipe() {
		
		return "Comunicar-se com a equipe, para pedir ajuda, novos métodos para desenvolver as tarefas"
				+ " e assim aprender novas maneiras de resolver os problemas."; 
		
	}
	
	
	@GetMapping ("/persistencia")
	public String Persistencia() {
		
		return "Sempre persistir, independente do resultado, quanto mais erramos e obvservamos onde estamos errando, mais aprendamos e "
				+ "solidificamos nossa base, aprendendo a aprender, com os erros, com os teste, sempre tentar resolver de alguma maneira"
				+ "assim persistindo sempre";
	}

	
	@GetMapping ("/mentalidadecrescimento")
	public String MentalidadeCrescimento() {
		
		return "Pensando sempre no crescimento pessoal e profissional, assim motivando-se com as dificuldades e complexidades,"
				+ "sabendo que toda essa fase, será muito valida como experiencia poara nosso crescimento e aprendizagem,"
				+ "tratar as dificuldades como motivação para um futuro melhor";
	}
	
	
	
	
}
