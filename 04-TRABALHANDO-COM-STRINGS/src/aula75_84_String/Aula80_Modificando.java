package aula75_84_String;

public class Aula80_Modificando {

	public static void main(String[] args) {
		//

		String teste = "Isso � um teste.";

		System.out.println(teste);
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10, 15));

		String ola = "ol�";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); // ola + mundo
		System.out.println(olaMundo);

		String espacos = "i s p a � o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);

		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);

		String nome = " meu nome �: ";
		System.out.println(nome);
		System.out.println(nome.trim());

		// web services
		// XML

		/*
		 * Isso � um teste. 
		 * teste. 
		 * teste 
		 * ol� mundo 
		 * e s p a � o 
		 * espa�o 
		 * meu nome
		 * �: meu nome �:
		 */

	}

}
