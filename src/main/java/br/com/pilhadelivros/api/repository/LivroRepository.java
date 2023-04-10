package br.com.pilhadelivros.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pilhadelivros.api.model.LivroModel;

@Repository
public interface LivroRepository extends JpaRepository<LivroModel, Long>{
	
	List<LivroModel>findByTitulo(String titulo);
	
	List<LivroModel>findByIsbn(String isbn);
}