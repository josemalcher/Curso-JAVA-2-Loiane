package aula85classemath;

public class Aula85ClasseMath {

	public static void main(String[] args) {

		// Fun��es trigonom�tricas
		// Fun��es Expontencias
		// Fun��es de Arrendondamento
		// Outras FUn��es

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
		
		//gera��o de n�mero aleat�rio
		System.out.println(Math.random());
		
		//limitar a gera��o de n�emro aleat�rio. At� 10 (*10)
		System.out.println(Math.round(Math.random() * 10));
		
		//fun��es trigonom�tricas
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(1)));
		System.out.println(Math.tan(Math.toRadians(45)));
		
		
		
		

	}

}
