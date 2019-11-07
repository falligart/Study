package Desafios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Elevador {
	
	public static void main(String[] args) {
		int n = 0;// andarAtual = 0;		
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos andares gostaria de estar visitando: "));
		ArrayList<Integer> andar = new ArrayList<Integer>();
				for(int a = 0; a < n ; a++) {
			andar.add(Integer.parseInt(JOptionPane.showInputDialog("Informe o andar que será visitado: ")));
		}
		
		//andarAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o andar atual"));
		ElevadorAux elev = new ElevadorAux();
		
		elev.movimentando(0,elev.ordenar(andar));
		
		
		
	}

}
