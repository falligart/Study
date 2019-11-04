package Casting;

public class Ex1Casting {
	
	public static void main(String[] args) {
		
		float dolar = 12.32f;
		double real = 13.32;
		int a;
		double b = 50;
		
		//conversão de valores para caber em um tipo de variavle menor
		real = (double) dolar;
		a = (int) b;
		System.out.println(a+ b+ real+ dolar);
		
	}

}
