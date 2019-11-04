package EstruturaControle;

import java.util.Scanner;

public class Ex5Controle {

	public static void main(String[] args) {
		
		int x, validador = 0;
		Scanner scan = new Scanner(System.in);
		x = Integer.parseInt(scan.nextLine());
		
		if(x == 1) {validador = 1;}
		if(x == 2) {validador = 2;}
		if(x == 3) {validador = 3;}
		if(x == 4) {validador = 4;}
		if(x > 4 && x < 7) {validador = 5;}
		else if(x > 7 && x < 10) {validador = 6;}
		else if(x > 9 && x < 21) {validador = 7;}
		else if(x > 22) {validador = 8;}
		
		
		switch(validador) {
		case 1:
			System.out.println("Região SUL!!");
			break;
		case 2:
			System.out.println("Região NORTE!!");
			break;
		case 3:
			System.out.println("Região LESTE!!");
			break;
		case 4:
			System.out.println("Região OESTE!!");
			break;
		case 5:
			System.out.println("Região NORDESTE!!");
			break;
		case 6:
			System.out.println("Região SUDESTE!!");
			break;
		case 7:
			System.out.println("Região CENTRO-OESTE!!");
			break;
		case 8:
			System.out.println("Região NOROESTE!!");
			break;
				
		}
		scan.close();
		
	}
	
}
