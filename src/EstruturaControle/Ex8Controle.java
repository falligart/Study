package EstruturaControle;

import java.util.Scanner;

public class Ex8Controle {

	public static void main(String[] args) {
		int valA, valB, valC, cod, verificador = 0;
		Scanner scan = new Scanner(System.in);
		double valorP = 0, totalP = 0;
		String nomeP;
		
		
		
		//Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem decrescente. Utilize seleção encadeada. 
		System.out.println("Informe um numero: ");
		valA = Integer.parseInt(scan.next());
		System.out.println("Informe um numero: ");
		valB = Integer.parseInt(scan.next());
		System.out.println("Informe um numero: ");
		valC = Integer.parseInt(scan.next());
		
		
		if(valA < valB) {			
			if(valB < valC) {
				System.out.println("Apresentação dos valores de forma decrescente: "+valC + ", "+valB + ", " +valA);
			}else {
				System.out.println("Apresentação dos valores de forma decrescente: "+valB + ", "+valC + ", " +valA);
			}			
		}else if(valB < valA) {
			if(valA < valC) {
				System.out.println("Apresentação dos valores de forma decrescente: "+valC + ", "+valA + ", " +valB);
			}else {
				System.out.println("Apresentação dos valores de forma decrescente: "+valA + ", "+valC + ", " +valB);
			}			
		}else if(valC < valA) {
			if(valB < valA) {
				System.out.println("Apresentação dos valores de forma decrescente: "+valA + ", "+valB + ", " +valC);
			}else {
				System.out.println("Apresentação dos valores de forma decrescente: "+valB + ", "+valA + ", " +valC);
			}			
		}
		System.out.println("\n\n---------------------- 2 Parte ---------------\n\n");
		
		//Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
		System.out.println("Informe o nome do produto:");
		nomeP = scan.next();
		System.out.println("Informe o valor do produto: ");
		valorP = Double.parseDouble(scan.next());
		System.out.println("\nSiga o codigo conforme tabela abaixo:\nCOD \t| \tCondicao\n"
				+ "1\t|\tA vista em dinheiro ou cheque (10% desconto)\n"
				+ "2\t|\tA vista no cartao de credito (5% desconto)\n"
				+ "3\t|\tEm duas vezes, preco normal de etiqueta sem juros\n"
				+ "4\t|\tEm tres vezes, preço com juros (10% juros)\n\nDigite o codigo desejado:");
		cod = scan.nextInt();
		
		switch(cod) {
		case 1:	totalP = valorP - (valorP * 0.10);break;
		case 2:	totalP = valorP - (valorP * 0.05);break;
		case 3:
			totalP = valorP;
			verificador = 2;
			break;
		case 4:
			totalP = valorP + (valorP * 0.10);
			verificador = 3;
			break;
		}
		
		if(verificador != 0) {
			totalP = totalP / verificador;	
			System.out.println("O produto "+nomeP+" de acordo com a opção escolhida "
					+ "será parcelado em "+verificador+" ficando no "
							+ "valor de R$ "+totalP+" para cada parcela");
		}else {
			System.out.println("O produto "+nomeP+" de acordo com a opção escolhida irá "
					+ "ficar no valor de R$ "+ totalP);
			
		}
		
		
		scan.close();
	}	
}
