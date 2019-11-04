package EstruturaControle;

import java.util.Scanner;

public class Ex10Controle {

	public static void main(String[] args) {
		double peso, altura, imc;
		String tipo = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o peso:");
		peso = sc.nextDouble();
		System.out.println("Informe a altura:");
		altura = sc.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		
		if(imc <= 18.5) {
			tipo = "abaixo do peso";			
		}else if(imc > 18.5 & imc <= 25) {
			tipo = "peso normal";
		}else if(imc > 25 & imc <= 30) {
			tipo = "acima do peso";
		}else if(imc > 30) {
			tipo = "obeso";
		}		
		
		
		System.out.println("IMC igual a: "+String.format("%.2f", imc)+ " você se encontra em: " + tipo);
		sc.close();
	}
	
}
