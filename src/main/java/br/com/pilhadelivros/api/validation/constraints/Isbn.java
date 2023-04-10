package br.com.pilhadelivros.api.validation.constraints;

import java.lang.annotation.*;

import br.com.pilhadelivros.api.validation.IsbnValidation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = IsbnValidation.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface Isbn {

	String message() default "ISBN Inválido";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
