package EstruturaControle;

import java.util.Scanner;

public class Ex12Controle {

	public static void main(String[] args) {
		
//		Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um diagrama de blocos que leia a vari�vel P (peso de peixes) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
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
