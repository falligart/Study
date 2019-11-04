package ExerciciosApostila;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		double b,h,s;
		Scanner scan = new Scanner(System.in);
		
		b = Double.parseDouble(scan.nextLine());
		h = Double.parseDouble(scan.nextLine());
		s = ((b*h)/2);
		System.out.println(s);
		scan.close();
		
	}
	
	
}
