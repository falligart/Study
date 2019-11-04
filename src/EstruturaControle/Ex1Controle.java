package EstruturaControle;

import java.util.Scanner;

public class Ex1Controle {

	public static void main(String[] args) {
		int a,total;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		a = Integer.parseInt(scan.nextLine());
		total = a%2;
		
		if(total == 0) {System.out.println("Numero informado é um numero PAR!!");}
		else {System.out.println("Numero informado é um numero IMPAR!!");}
		
		scan.close();
		
	}
	
}
