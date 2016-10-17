package aula75_84_String;

public class Aula83_Concatenacao {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=2GFp7URJyoo
		
		String[] letras = { "B", "C", "D", "E", "F" };

		String alfabeto = "";

		for (String letra : letras) {
			alfabeto += letra;
		}

		System.out.println(alfabeto);

		// StringBuffer - TradeSafe (várias Threads)
		StringBuffer sb = new StringBuffer();
		for (String letra : letras) {
			sb.append(letra);
		}
		alfabeto = sb.toString();

		System.out.println(alfabeto);

		
		alfabeto = new String(sb);
		System.out.println(alfabeto);

		
		System.out.println(sb.reverse());

		
		// StringBuilder - Não TradeSafe
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}
		alfabeto = sb_.toString();

		System.out.println(alfabeto);

	}

}
