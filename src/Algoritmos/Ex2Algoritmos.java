package Algoritmos;

import java.util.Scanner;

public class Ex2Algoritmos {

	public static void main(String[] args) {
			
		double nota1, nota2, media;
		int anoNasci, anoAtual, totalAno;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		nota1 = Double.parseDouble(scan.nextLine());		
		System.out.println("Informe outro numero: ");
		nota2 = Double.parseDouble(scan.nextLine());		
		media = (nota1+nota2)/2;
		
		System.out.println("Informe o ano de nascimento: ");
		anoNasci = Integer.parseInt(scan.nextLine());
		System.out.println("Informe o ano atual: ");
		anoAtual = Integer.parseInt(scan.nextLine());
		totalAno = anoAtual - anoNasci;
		
		System.out.println("Média: "+media);
		System.out.println("Idade: "+totalAno);		
		scan.close();
	}
}
