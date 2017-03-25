package aula87calendar;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance(); //singleton
		System.out.println(hoje); //toString ->java.util.GregorianCalendar[time=1490477427236,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT-03:00",offset=-10800000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=84,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=30,SECOND=27,MILLISECOND=236,ZONE_OFFSET=-10800000,DST_OFFSET=0]
		
		int ano = hoje.get(Calendar.YEAR);
		System.out.println(ano);
		int mes = hoje.get(Calendar.MONTH);
		System.out.println(mes);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		System.out.println(dia);
		
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		int minutos = hoje.get(Calendar.MINUTE);
		System.out.println(minutos);
		int segundos = hoje.get(Calendar.SECOND);
		
		
		System.out.println(" ");
		System.out.println(Calendar.JANUARY); // 0
		System.out.println(Calendar.FEBRUARY);// 1
		
		System.out.println(" ");
		
		System.out.printf("hoje é %02d/%02d/%d, %02d:%02d:%02d",
								dia, (mes+1), ano,
								hora, minutos,segundos);
		
		System.out.println("");
		//adicionar e subtrair datas no Java
		hoje.add(Calendar.DAY_OF_MONTH, 6);
		hoje.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));

	}

}
