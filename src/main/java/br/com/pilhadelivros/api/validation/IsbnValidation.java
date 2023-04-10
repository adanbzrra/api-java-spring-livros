package br.com.pilhadelivros.api.validation;

import br.com.pilhadelivros.api.validation.constraints.Isbn;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**/
public class IsbnValidation implements ConstraintValidator<Isbn, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		/*
		Operador ternário para atribuir um valor à variável isbn
		Se o valor de value for nulo (null), então a variável isbn 
		receberá uma string vazia "".Caso contrário, ou seja, se o 
		valor de value não for nulo, a variável isbn receberá 
		o valor de value. 
		*/String isbn = value == null ? "": value;
		
		
		/*
		Esta expressão regular é composta por dois grupos 
		separados por um operador "ou" (|). O primeiro grupo valida
		o isbn de 13 dígitos com hífens, e o segundo grupo valida isbn
		de 10 ou 13 dígitos sem hífens.
		*/return isbn.matches("^(?:(?=.{17}$)97[89][-](?:[0-9]+[-]){2}[0-9]+[-][0-9]|(?:(?=.{13}$)(?:[0-9]+[-]){2}[0-9]+[-]?(?:[0-9]+)?))$");
	}

}
