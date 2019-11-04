package EstruturaControle;

import java.util.Scanner;

public class Ex12Controle {

	public static void main(String[] args) {
		
//		João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um diagrama de blocos que leia a variável P (peso de peixes) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		double peso = 0, excesso = 0, total = 0;
		final double multa = 4.00;
		Scanner sc = new Scanner(System.in);
		peso = sc.nextDouble();
		
		if(peso > 50) {
			excesso = peso - 50;
			total = multa * excesso;
			System.out.println("Multa a pagar R$: "+total);
		}
		sc.close();
		

		
	}
	
}
