package OperadoresLogicos;

import java.util.Scanner;

public class Ex3Operadores {
	
	public static void main(String[] args) {
		
		double a, b ,c, somaQ, valorV, resultV, cotDolar;
		String nome;
		int numero;
		Scanner scan = new Scanner(System.in);
		
		//Leia 2 n�meros e fa�a a multiplica��o dos mesmos e apresente o resultado.
		System.out.println("Digite um numero");
		a = Double.parseDouble(scan.nextLine());
		System.out.println("Digite um numero");
		b = Double.parseDouble(scan.nextLine());
		System.out.println("Digite um numero");
		c = Double.parseDouble(scan.nextLine());
		System.out.println("Soma dos dois primeiros valores: "+(a+b));
		
		//Leia 3 n�meros, calcule o quadrado de cada um, some os resultados e apresente o valor obtido.
		a = Math.pow(a, 2);
		b = Math.pow(b, 2);
		c = Math.pow(c, 2);
		somaQ = a+b+c;
		System.out.println("Soma dos quadrados dos numeros digitados: "+somaQ);
		
		//Baseado em um sistema de comiss�o por venda, capture o nome do funcion�rio, o valor das vendas que ele teve no m�s, calcule quanto � 8% do valor das vendas e apresente o resultado junto ao nome do vendedor.
		System.out.println("Informe seu nome: ");		
		nome = scan.nextLine();
		System.out.println("Digite o valor das vendas: ");
		valorV = Double.parseDouble(scan.nextLine());
		resultV = ((valorV*8)/100);
		System.out.println("8% das vendas realizadas no mes em R$: "+resultV + " pelo funcionario "+nome);
		
		//Parte 4 - Leia a cota��o do d�lar, leia um valor em d�lares e apresente quanto este valor em d�lares representa em em Reais (R$).
		System.out.println("Qual a cota��o atual do dolar: ");
		cotDolar = Double.parseDouble(scan.nextLine());
		System.out.println("Informe a quantidade de reais para a convers�o de dolares: ");
		numero = Integer.parseInt(scan.nextLine());
		System.out.println("Convers�o do valor em R$: "+(cotDolar*numero));
		scan.close();
		
	}

}
