package aula86date;

import java.util.Date;

public class Aula86ClasseData {

	public static void main(String[] args) {
		//Sat Mar 25 18:02:53 GMT-03:00 2017
		Date hoje = new Date();
		System.out.println(hoje);
		
		//milisegundos desde 1 Jan 1970
		System.out.println(hoje.getTime());
		
		//Pega o dia do mês
		System.out.println(hoje.getDate());
		
		

	}

}
