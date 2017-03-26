package aula90locale;

import java.text.NumberFormat;
import java.util.Locale;

/*
 * Curso de Java #90: Locale (Internacionalização)
 * https://www.youtube.com/watch?v=eLjZ_L7FA4s
 * 
 * https://docs.oracle.com/javase/7/docs/api/java/util/Locale.html
 * http://blog.caelum.com.br/internacionalizacao-no-codigo-java/
 * 
 */

public class Aula90LocaleInternacionalizacao {

	public static void main(String[] args) {
		
		// dd/MM/yyyy (BRA)
		// MM/dd/yyyy (EUA)
		
		// 1.000,02 (BRA)
		// 1,000.02 (EUA)
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		//pt_BR
		
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale loc : locales) {
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Cód: "+ loc.getLanguage());
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("Cod País: "+ loc.getCountry());
			System.out.println("País: "+ loc.getDisplayCountry());
			System.out.println("****************************");
		}
		
		Locale br = new Locale("pt", "Brazil");
		System.out.println(br);
		
		Locale.setDefault(br);
		System.out.println(Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf2.format(5000000d));
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf3.format(5000000d));
		

	}

}
