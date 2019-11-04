package OperadoresLogicos;

import java.util.ArrayList;

public class Ex4Operadores {
	
	// Tendo as variáveis SALARIO, IR e SALLIQ, e considerando os valores abaixo. Informe se as expressões são verdadeiras ou falsas.
	public static void main(String[] args) {
		ArrayList<Double> ir = new ArrayList<Double>();
		ArrayList<Double> salario = new ArrayList<Double>();
		ArrayList<Double> salliq = new ArrayList<Double>();
		
		for(int i= 1; i < 4; ++i) {
			salario.add(100.00*(i));
			ir.add(5.00*(i));
		}
		
		salliq.add(100.00);
		salliq.add(190.00);
		salliq.add(285.00);
		
		System.out.println(salliq.get(0) >= 100.00);
		System.out.println(salliq.get(1) < 190.00);
		System.out.println(salliq.get(2) == (salario.get(2) - ir.get(2)));

		
		
	}
	
	
	

}
