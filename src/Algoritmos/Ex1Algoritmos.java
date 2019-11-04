package Algoritmos;

import java.util.Scanner;

public class Ex1Algoritmos {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cod, qtdPeca;
		double valorPeca, total;
		double x, y, z, media;
		
		System.out.println("Informe o codigo do produto: ");
		cod = Integer.parseInt(scan.nextLine());
		System.out.println("Informe a quantidade de peças do produto: ");
		qtdPeca = Integer.parseInt(scan.nextLine());
		System.out.println("Informe o valor do produto: ");
		valorPeca = Double.parseDouble(scan.nextLine());
		
		total = valorPeca * qtdPeca;
		System.out.println("Valor total do produto serializado: " + cod + " (Valor x Produtos): "+ total);
		
		System.out.println("Informe um numero: ");
		x = Double.parseDouble(scan.nextLine());		
		System.out.println("Informe outro numero: ");
		y = Double.parseDouble(scan.nextLine());
		System.out.println("Informe outro numero: ");
		z = Double.parseDouble(scan.nextLine());
		
		media = (x+y+z)/3;
		
		System.out.println("média igual a: "+media);
		scan.close();
		
		

		
	}

}
