package Desafios;

import javax.swing.JOptionPane;

public class GasolinaEtanol {
	
	public static void main(String[] args) {
		double a,b;
		String result;
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do litro de etanol: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do litro de gasolina: "));
		
		GasolinaAux gaset = new GasolinaAux();
		result = gaset.preco(a,b);
		JOptionPane.showMessageDialog(null, result);
	}

}
