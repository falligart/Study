package Lab;

import java.util.Scanner;

public class Exercicio2Modulo6classePrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		double d,c;
		Exercicio1Modulo6classeCalculadora calc = new Exercicio1Modulo6classeCalculadora();
		System.out.println("Informe um numero: ");
		a = sc.nextInt();
		System.out.println("Informe um numero: ");
		b = sc.nextInt();
		
		d = b*1.21;
		c = a*1.019;
		System.out.println("Multiplicar: "+calc.multiplicar(a, b));
		System.out.println("Multiplicar: "+calc.multiplicar(c, d));

		System.out.println("Subtrair: "+calc.subtrair(a, b));
		System.out.println("Subtrair: "+calc.subtrair(c, d));
		
		System.out.println("Soma: "+calc.soma(a, b));
		System.out.println("Soma: "+calc.soma(c, d));
		
		System.out.println("Dividir: "+calc.dividir(a, b));
		System.out.println("Dividir: "+calc.dividir(c, d));
		sc.close();
	}
	
}