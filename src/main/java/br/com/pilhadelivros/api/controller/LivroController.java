package br.com.pilhadelivros.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.pilhadelivros.api.model.LivroModel;
import br.com.pilhadelivros.api.repository.LivroRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/pilha")
public class LivroController {
	
	@Autowired
	private LivroRepository livroRepository;
	
	/*Retornar uma lista de todos os livros armazenados na pilha*/
	
	@GetMapping("/livros")
	public List<LivroModel>findAll(){
		return  this.livroRepository.findAll();
	}
	
	/*Retorna uma livro da lista de livros passando o título*/
	
	@GetMapping("/livro/titulo")
	public List<LivroModel>findByTitulo(@Valid @RequestParam("titulo") String titulo){
		return this.livroRepository.findByTitulo(titulo);
	}
	
	/*Retorna um livro da lista de livros passando o isbn*/
	
	@GetMapping("/livro/isbn")
	public List<LivroModel>findByIsbn(@Valid @RequestParam("isbn") String isbn){
		return this.livroRepository.findByIsbn(isbn);
	}
	
	/*Adiciona um novo objeto Livro no banco de dados*/
	/*Para criar um novo objeto livro utilize no corpo da requisição o formato JSON:
	  
	  	{
		  	"isbn": "",
		 	"titulo": "",
		 	"genero": "",
		 	"ano": ""
		}
	 
	 */
	@PostMapping("/livro/add")
	public LivroModel addLivro(@Valid @RequestBody LivroModel livro) {
		return this.livroRepository.save(livro);
	}
	
	
	
	
	
	
}
