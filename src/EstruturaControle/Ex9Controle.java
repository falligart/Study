package EstruturaControle;

import java.util.Scanner;

public class Ex9Controle {

	public static void main(String[] args) {
		double n1 = 0, n2 = 0, total;
		int verif;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero\tDescricao:\n" + "1\tSoma\n" + "2\tSubtracao\n" + "3\tMultiplicacao\n"
				+ "4\tDivisao\n\n" + "Informe a sua opção:");
		verif = sc.nextInt();
		
		System.out.println("Informe um numero para operação: ");
		n1 = sc.nextDouble();
		System.out.println("Informe outro numero para operação: ");
		n2 = sc.nextDouble();
		

		switch (verif) {
		case 1:
			total = n1 + n2;
			System.out.println("Resultado da soma: "+total);
			break;
		case 2:
			total = n1 - n2;
			System.out.println("Resultado da subtração: "+total);
			break;
		case 3:
			total = n1* n2;
			System.out.println("Resultado da Multiplacacao: "+total);
			break;
		case 4:
			total = n1 / n2;
			System.out.println("Resultado da Divisao: "+total);
			break;
		default:
			System.out.println("Nenhuma opção selecionada.");

		}
		
		sc.close();

	}

}
