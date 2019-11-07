package Lab;

import javax.swing.JOptionPane;

public class Exercicio1Modulo7classePrincipal {
	
	public static void main(String[] args) {
		Exercicio1Modulo7classeCadastro cadastro = new Exercicio1Modulo7classeCadastro();
		Exercicio1Modulo7classeCadastro cadastro1;
		Exercicio1Modulo7classeCadastro cadastro2;
		
		String textA, textB;
		int x;
		
		textA = JOptionPane.showInputDialog("Informe um texto: ");
		textB = JOptionPane.showInputDialog("Informe outro texto: ");
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro: "));
		cadastro1 = new Exercicio1Modulo7classeCadastro(textA,textB);
		cadastro2 = new Exercicio1Modulo7classeCadastro(textA,textB,x);
		
		cadastro.mostrar();
		cadastro1.mostrar();
		cadastro2.mostrar();

		
	}

}
