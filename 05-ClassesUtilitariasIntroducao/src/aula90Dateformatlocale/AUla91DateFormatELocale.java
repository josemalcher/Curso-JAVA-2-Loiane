package aula90Dateformatlocale;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * 
 * Curso de Java #91: Formatando datas com DateFormat e Locale
 * https://www.youtube.com/watch?v=IR8eOFWbgjk
 * 
 */
public class AUla91DateFormatELocale {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(Locale.getDefault());
		
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//Locale.setDefault(new Locale("en","US"));
		Locale.setDefault(new Locale("pt","BR"));
		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);//dd/MMM/yyyy
		
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);//dd/MMM/yyyy
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);//dd/MMM/yyyy
		
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);//dd/MMM/yyyy
		
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);//dd/MMM/yyyy
		
		System.out.println("*******");
		//Sttring para Data
		
		String data = "12/02/2017 14:25";
		try {
			Date dateDate = DateFormat.getInstance().parse(data);
			System.out.println(dateDate);
			
			//Transforma em Calendar
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dateDate);
			System.out.println(calendario);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
