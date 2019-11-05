package Desafios;

import javax.swing.JOptionPane;

public class ElevadorAux {

	private String estado;

	public String movimentando(int a) {
		if (a != 0) {
			for (int and = 0; and <= a; and++) {
				JOptionPane.showMessageDialog(null, and + "º Andar");
				if (and != a) {
					setEstado("Se movimentando para o destino");
					continue;
				} else {
					setEstado("Chegado ao destino!!");
					JOptionPane.showMessageDialog(null, "Se movimentando para o terreo!!");
					for (int andN = and; andN >= 0; andN--) {
						setEstado("Se movimentando para o Terreo");
						JOptionPane.showMessageDialog(null, andN + "º Andar");
					}
					break;
				}
			}
		} else { JOptionPane.showMessageDialog(null, "Você já esta no Terreo");
		}
		return getEstado();
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
