package aula55EnumValueValueOf;

import aula53Enumeradores.DiaSemana;;

public class TesteEnum2 {

	public static void main(String[] args) {
		
		//DiaSemana dia;
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		//OU
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		System.out.println(dia);

	}

}
