package Desafios;

import javax.swing.JOptionPane;

public class Elevador {
	
	public static void main(String[] args) {
		int andar;
		
		andar = Integer.parseInt(JOptionPane.showInputDialog("Informe o andar desejado: "));
		ElevadorAux elev = new ElevadorAux();
		
		
		elev.movimentando(andar);
		
		
		
	}

}
