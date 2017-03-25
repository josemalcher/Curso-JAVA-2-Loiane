package aula85classemath;

public class Aula85ClasseMath {

	public static void main(String[] args) {

		// Funções trigonométricas
		// Funções Expontencias
		// Funções de Arrendondamento
		// Outras FUnções

		// 2 * 2 * 2
		System.out.println(Math.pow(2, 3));

		// Arredondamento para cima
		System.out.println(Math.round(4.7));
		// Arredondamento para baixo
		System.out.println(Math.round(4.4));

		// arredondamento para cima, sempre
		System.out.println(Math.ceil(4.7));
		System.out.println(Math.ceil(4.4));

		// arredondamento para Baixo, sempre
		System.out.println(Math.floor(4.7));
		System.out.println(Math.floor(4.4));
		
		//geração de número aleatório
		System.out.println(Math.random());
		
		//limitar a geração de núemro aleatório. Até 10 (*10)
		System.out.println(Math.round(Math.random() * 10));
		
		//funções trigonométricas
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(1)));
		System.out.println(Math.tan(Math.toRadians(45)));
		
		
		
		

	}

}
