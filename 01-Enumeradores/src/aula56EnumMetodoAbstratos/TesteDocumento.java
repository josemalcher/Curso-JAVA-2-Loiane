package aula56EnumMetodoAbstratos;

public class TesteDocumento {
	public static void main(String[] args) {

		/*
		 * Teste impressão dos numeros for (TipoDocumento doc :
		 * TipoDocumento.values()) { System.out.println(doc + " - " +
		 * doc.geraNumeroTeste()); }
		 */
		
		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
		System.out.println(pf);
		
		System.out.println();
		
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj);
	}
}
