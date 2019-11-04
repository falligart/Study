package EstruturaControle;

import java.util.Scanner;

public class Ex3Controle {

	public static void main(String[] args) {
		
		double salario;
		int tempo;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o salario: ");
		salario = Double.parseDouble(scan.nextLine());
		System.out.println("Informe os anos de trabalho: ");
		tempo = Integer.parseInt(scan.nextLine());
		
		if(tempo >= 5) {salario = salario + (salario* 0.20);}
		else {salario = salario + (salario* 0.10);}
		
		System.out.println("Salario de acordo com o bonus salarial decorrente do tempo de empresa é igual a: R$ "+salario);
		
		scan.close();
		
	}
	
}
