package Lab;

import java.util.Random;

public class Exercicio1Modulo8clasePrincipal {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int valores[] = new int[15];
		for(int a = 0; a < 15;a++) {
			valores[a] = rand.nextInt(100+1);
			System.out.println(valores[a]);

		}
		
		Exercicio1Modulo8classeAux aux = new Exercicio1Modulo8classeAux();
		System.out.println("Maior valor passado: "+aux.verificarArray(valores));
		
	}

}
