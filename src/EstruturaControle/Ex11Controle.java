package EstruturaControle;

import java.util.Scanner;

public class Ex11Controle {

	public static void main(String[] args) {
		
		double salario, aliquota = 0, total;
		Scanner sc = new Scanner(System.in);
		
		salario = sc.nextDouble();
		
		if(salario <= 360) {
			aliquota = 8;
		}else if(salario > 360 && salario <= 600) {
			aliquota = 9;
		}else if(salario > 600 && salario <= 1200) {
			aliquota = 11;
		}else if(salario > 1200) {
			aliquota = 1;
		}
		
		if(aliquota != 1) {
			total = salario - (salario*(aliquota/100));
		}else {
			total = salario - 132;
		}
		
		System.out.println("Salario é igual a: "+salario+"\nAliquota igual a:"+aliquota+""
				+ "Salario com descontos igual a: "+total);
		sc.close();
		
	}
	
}
