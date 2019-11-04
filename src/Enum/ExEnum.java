package Enum;

public class ExEnum {

	public enum diaSemana{SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;}
	
	public static void main(String[] args) {
		
		diaSemana diaLegal = diaSemana.SEXTA;
		System.out.println(diaLegal.name());
	
		
	}
	
	
	
}
