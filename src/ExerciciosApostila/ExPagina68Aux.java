package ExerciciosApostila;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExPagina68Aux {

	public void validaNota(ArrayList<Integer> lista) {
		for (int a : lista) {
			if (a >= 7) {
				JOptionPane.showMessageDialog(null, "Aluno " + a + ": Aprovado!!");
			} else if (a >= 4) {
				JOptionPane.showMessageDialog(null, "Aluno " + a + ": de Exame!!");
			} else {
				JOptionPane.showMessageDialog(null, "Aluno " + a + ": Reprovado!!");
			}
		}
	}
}
