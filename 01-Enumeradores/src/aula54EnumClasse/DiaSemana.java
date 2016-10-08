package aula54EnumClasse;

public enum DiaSemana {
	SEGUNDA(1), TERCA(2), 
	QUARTA(3), QUINTA(4), 
	SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor;
	
	DiaSemana(int valor) {
		this.valor = valor;
	}
	
	public int getValor(){
		return this.valor;
	}
	
	/*
	 *  Enums extends a classe java.lang.Enum
	 *  
	 *  Podem ser comparadas usando ==
	 *  
	 *  Não podem ser instanciadas com new
	 *  
	 *  Podem implementar interfaces
	 *  
	 *  Pose ser declarado separadamento ou dentro de classe
	 * 
	 * 
	 */
}
