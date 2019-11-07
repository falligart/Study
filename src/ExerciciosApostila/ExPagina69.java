package ExerciciosApostila;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ExPagina69 {

	public static void main(String[] args) {
		int x = 0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		x = sc.nextInt();
		int[] lista = new int[x];
		String[] listaStr = new String[x];

		for (int a = 0; a < x; a++) {
			lista[a] = rand.nextInt(9 + 1);
		}

		Arrays.sort(lista);

		for (int y = 0; y < lista.length; y++) {
			System.out.println(lista[y]);
		}
		int cont = 0;
		while (cont < x) {
			System.out.println("Digite uma letra: ");
			listaStr[cont] = sc.next().toUpperCase();
			if (listaStr[cont].matches("^[0-9]*")) {
				System.out.println("Digite somente caracteres!!");
				listaStr[cont] = "";
			} else {
				cont++;
			}

		}
		
		Arrays.sort(listaStr, Collections.reverseOrder());
		for (int y = 0; y < lista.length; y++) {
			System.out.println(listaStr[y]);
		}
		sc.close();

	}

}
