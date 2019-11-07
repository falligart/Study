package ExerciciosApostila;

import java.util.Scanner;

public class ExPagina70 {
	
	public static void main(String[] args) {
		
		int x[] = new int[10];
		int dobro[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int p = 0; p< 10; p++) {
			x[p] = sc.nextInt();
			dobro[p] = (int) Math.pow(x[p], 2);
			
		}
		for(int a = 0; a < 10; a++) {System.out.println(x[a]);
		System.out.println(dobro[a]);}
		sc.close();
		
	}

}
