package ExerciciosApostila;

import java.util.Random;

public class ExPagina67 {
	
	public static void main(String[] args) {
		
		int[] a = new int[10];
		Random rand = new Random();

		for(int b = 0; b < 10; b++) {
			a[b] = rand.nextInt(9+1);}
		
		ExPagina67aux aux = new ExPagina67aux();
		aux.ler(a);
		
	}

}
