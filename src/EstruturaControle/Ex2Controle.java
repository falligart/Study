package EstruturaControle;

import java.util.Scanner;

public class Ex2Controle {

	public static void main(String[] args) {

		double valor = 0;
		boolean validador = false;
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um numero: ");

		while (validador == false) {
			try {
				valor = Double.parseDouble(scan.nextLine());
				validador = true;
			} catch (Exception e) {
				System.out.println("Valor digitado invalido!!!, digite novamente:");
			}
		}

		if (valor > 20) {
			System.out.println("Numero informado é maior que 20!!");
		} else {
			System.out.println("Numero informado é menor ou igual a 20!!");
		}

		scan.close();

	}

}
