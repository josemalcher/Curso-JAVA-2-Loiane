package aula88classegregoriancalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88ClasseGregoriancalendar {

	public static void main(String[] args) {
		
		Calendar calendar01 = Calendar.getInstance();
		
		GregorianCalendar CalenGregorio = new GregorianCalendar();
		//java.util.GregorianCalendar[time=1490479227152,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT-03:00",offset=-10800000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=84,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=0,SECOND=27,MILLISECOND=152,ZONE_OFFSET=-10800000,DST_OFFSET=0]
		//System.out.println(CalenGregorio);
		
		
		//Gregoriam extende a classe Calendar (polimorfismo)
		//hoje é 25/03/2017, 20:01:28
		imprimirData(CalenGregorio);
		
		//diferença - Método para verificar se ano é bissexto
		System.out.println(CalenGregorio.isLeapYear(2017));
		
		GregorianCalendar calGregorio02 = new GregorianCalendar(2017,0,1);
		imprimirData(calGregorio02);
		//hoje é 01/01/2017, 00:00:00
		
		GregorianCalendar calGregorio03 = new GregorianCalendar(2017,0,1,14,30,23);
		imprimirData(calGregorio03);
		//hoje é 01/01/2017, 14:30:23
		

	}
	
	private static void imprimirData(Calendar hoje){
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
			
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("hoje é %02d/%02d/%d, %02d:%02d:%02d",
				dia, (mes+1), ano,
				hora, minutos,segundos);
		System.out.println("");
		
	}

}
