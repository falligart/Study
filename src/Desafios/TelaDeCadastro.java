package Desafios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TelaDeCadastro {

	public static void main(String[] args) {
		  Object[] botoes = { "Sim", "Não" };
		String a,b,c;
		ArrayList<RegistrodeNascimento> reg = new ArrayList<RegistrodeNascimento>();
		RegistrodeNascimento registro;
		boolean gestacao;
		int ac = 0;
		
		for(int x = 0; x < 5; x++) {
			a = JOptionPane.showInputDialog("Informe o nome:");
			b =  JOptionPane.showInputDialog("Informe o nome da mae: ");
			c = JOptionPane.showInputDialog("Informe o sexo: ");
			registro = new RegistrodeNascimento(a, b, c);
			ac = JOptionPane.showOptionDialog(null,"Escolha um:","Aviso",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botoes, botoes[0]);			
			reg.add(registro);
		}
		
	}
	
}
