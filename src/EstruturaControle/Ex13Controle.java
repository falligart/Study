package EstruturaControle;

import java.util.Scanner;

public class Ex13Controle {
	public static void main(String[] args) {
		double horas = 0, salario = 0, e = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de horas:");
		horas = sc.nextDouble();
		
		if(horas > 50) {
			e = horas - 50;
			salario = (50*10)+(20*e);
		}else {
			salario = horas*10;
		}
		System.out.println(salario);
		sc.close();
		
		
		
		
	}
}
