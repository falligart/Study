package EstruturaControle;

import java.util.Scanner;

public class Ex6Controle {
	
	public static void main(String[] args) {
		
		double n1, n2, n3, n4, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		n1 = Double.parseDouble(sc.nextLine());
		System.out.println("Digite outro numero: ");
		n2 = Double.parseDouble(sc.nextLine());
		System.out.println("Digite outro numero: ");
		n3 = Double.parseDouble(sc.nextLine());
		System.out.println("Digite outro numero: ");
		n4 = Double.parseDouble(sc.nextLine());
		
		media = (n1+n2+n3+n4)/4;
		
		if(media >= 7) {System.out.println("Aluno aprovado!!!");}
		else {System.out.println("Aluno reprovado!!!");}
		sc.close();
		
	}
		
		
		

}
