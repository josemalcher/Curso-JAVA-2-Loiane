package aula63Printf;

public class ExemploPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%s", "Olá, Mundo!"); // Olá, Mundo!
		System.out.println();
		System.out.printf("%S", "Olá, Mundo!"); // OLÁ, MUNDO!
		System.out.println();

		System.out.printf("%c", 'c'); // c
		System.out.println();
		System.out.printf("%C", 'c');// C

		System.out.printf("%n"); // pulando linha

		int valor = 123456789;
		System.out.printf("%d", valor); // 123456789

		System.out.println();

		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante); // 3,145679

		System.out.println();

		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo); // Olá, Mundo!

		System.out.println();

		System.out.printf("%-20s", olaMundo); // Olá, Mundo!

		System.out.println();

		System.out.printf("%+d", valor);// +123456789

		System.out.println();

		System.out.printf("%015d", valor);// 000000123456789

		System.out.println();

		System.out.printf("%,d", valor); // usem , //123.456.789

		System.out.println();

		int valor2 = -123456789;
		System.out.printf("% d", valor2); // -123456789
		System.out.println();
		System.out.printf("% d", valor);// 123456789

		System.out.println();

		System.out.printf("%.3f", pontoFlutuante); // 3,146

		System.out.println();

		System.out.printf("R$%10.2f", pontoFlutuante);// R$ 3,15

		System.out.println();

		testeMaisCompleto();
		/*
		 * Item 01: total de R$ 10.000,00 
		 * Item 02: total de R$ 123,54 
		 * Item 03: total de R$ 7.843,57 
		 * Item 04: total de R$ 1,00 
		 * Item 05: total de R$ 4,57
		 */
	}

	private static void testeMaisCompleto() {

		double[] precos = { 10000, 123.54, 7843.567, 1, 4.56789 };

		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
		}

		// Java.util.Formater
	}

}
