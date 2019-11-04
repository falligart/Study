package EstruturaControle;

import java.util.Scanner;

public class Ex4Controle {

	public static void main(String[] args) {
		
		double n1, n2, n3,n4, total;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		n1 = Double.parseDouble(scan.nextLine());
		System.out.println("Informe um numero: ");
		n2 = Double.parseDouble(scan.nextLine());
		System.out.println("Informe um numero: ");
		n3 = Double.parseDouble(scan.nextLine());
		System.out.println("Informe um numero: ");
		n4 = Double.parseDouble(scan.nextLine());
		
		scan.close();
		total = (n1+n2+n3+n4)/4;
		System.out.println("Média das notas e igual a: "+total);
		
		
	}
	
}
