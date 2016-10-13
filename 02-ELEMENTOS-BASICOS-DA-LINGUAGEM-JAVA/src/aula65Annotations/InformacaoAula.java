package aula65Annotations;

public @interface InformacaoAula {
	String autor();

	int aulaNumero();

	String blog() default "http://josemalcher.net";

	String site() default "http://loiane.training";
}
