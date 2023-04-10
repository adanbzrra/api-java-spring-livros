package br.com.pilhadelivros.api.model;

import br.com.pilhadelivros.api.validation.constraints.Isbn;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*classe Java que representa a entidade Livro do sistema.*/
@Data
@Entity
@Table(name = "livros")
public class LivroModel {
	
	@Id
	@Column(name = "ID_LIVRO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Isbn
	@Column(name = "ISBN_LIVRO", nullable = false)
	private String isbn;

	@Column(name = "TITULO_LIVRO", nullable = false)
	private String titulo;
	
	@Column(name = "GENERO_LIVRO")
	private String genero;
	
	@Column(name = "ANO_LIVRO")
	private String ano;
	
}
