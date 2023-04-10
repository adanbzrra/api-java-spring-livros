# api-java-spring-livros
Desenvolvimento de uma API com Spring para testar validações com Spring Boot Validation.

Api simples de armazenamento e banco de dados permite visualizar os metadados
de uma pilha de livros.

- Recupera uma lista de livros
- Recupera um livro por um recurso especificado
- Adiciona um novo livro no banco de dados

### Database 
1. CREATE DATABASE PILHA_DE_LIVROS;
2. USE PILHA_DE_LIVROS;
3. CREATE TABLE LIVROS (
4. ID_LIVRO INT NOT NULL AUTO_INCREMENT,
5. ISBN_LIVRO int(17) NOT NULL,
6. TITULO_LIVRO varchar(30) NOT NULL,
7. GENERO_LIVRO varchar(30),
8. ANO_LIVRO varchar(30),
9. PRIMARY KEY (ID_LIVRO)
10. );


O isbn ou “International Standart Book Numbers”. Ele
é composto por 17 dígitos com hífens. é utilizado para
identificar os livros numericamente. Essa identificação
permite a idividualização da publicação.

### Testes de validação

### Teste de ISBN inválido:
- Contendo letras
- Com tamanho menor que 13 dígitos
- Com tamanho maior que 13 dígitos
- Vazio
- Nulo
- Com 13 dígitos sem hífens
- Com 13 dígitos com hífens
- Com 10 dígitos com hífens

### ISBN válido:
- 978-65-89999-01-3