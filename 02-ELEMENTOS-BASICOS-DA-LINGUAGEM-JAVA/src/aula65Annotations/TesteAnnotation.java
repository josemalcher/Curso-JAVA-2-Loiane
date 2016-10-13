package aula65Annotations;

@InformacaoAula(
		aulaNumero = 65, 
		autor = "Loiane")
public class TesteAnnotation {
	@InformacaoAula(
			autor = "Loiane", 
			aulaNumero = 65, 
			blog = "loiane.com"
			)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
