package Desafios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ElevadorAux {

	private String estado;

	public String movimentando(int andarAtual, ArrayList<Integer> lista) {
		int ultAndar = andarAtual;
		for (int b : lista) {
			if (b > ultAndar) {
				for (int and = ultAndar; and <= b; and++) {
					JOptionPane.showMessageDialog(null, and + "º Andar");
					if (and != b) {
						setEstado("Se movimentando para o destino");
						continue;
					}
				}				
			} else if(b < ultAndar) {
				for (int and = ultAndar; and >= b; and--) {
					JOptionPane.showMessageDialog(null, and + "º Andar");
					if (and != b) {
						setEstado("Se movimentando para o destino");
						continue;
					}
				}				
			}
			JOptionPane.showMessageDialog(null, "Você chegou ao seu destino: " + b);
			ultAndar = b;
		}

		for (int andN = ultAndar; andN >= 0; andN--) {
			setEstado("Se movimentando para o Terreo");
			JOptionPane.showMessageDialog(null, andN + "º Andar");
			ultAndar = andN;
		}
		JOptionPane.showMessageDialog(null, "Você chegou ao TERREO");
		return getEstado();
	}
		
	public ArrayList<Integer> ordenar(ArrayList<Integer> lista) {
		Collections.sort(lista);
		return lista;
	}
	
	public ArrayList<Integer> ordenarR(ArrayList<Integer> lista) {
		lista.sort(Collections.reverseOrder());
		return lista;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
