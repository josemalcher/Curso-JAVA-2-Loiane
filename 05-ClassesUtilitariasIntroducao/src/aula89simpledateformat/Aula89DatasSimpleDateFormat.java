package aula89simpledateformat;
/*
 * Curso de Java #89: Formatando datas com SimpleDateFormat
 * https://www.youtube.com/watch?v=cbJdNgxkJqY
 * 
 * http://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html
 * 
 * 
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89DatasSimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z");
		
		Calendar data = new GregorianCalendar(2020, 2, 20,14,30,59);
		
		System.out.println(sdf.format(data.getTime()));
		
		System.out.println("");
		Date hoje = new Date();
		System.out.println(sdf.format(hoje));
		// Data para String
		

		// String para Data
		SimpleDateFormat sdf01 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "10/01/2000";
		
		try {
			Date minhaDataEmDate = sdf01.parse(minhaData);
			System.out.println(minhaDataEmDate);
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 	

	}

}
