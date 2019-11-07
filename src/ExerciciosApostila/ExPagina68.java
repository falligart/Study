package ExerciciosApostila;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExPagina68 {

	public static void main(String[] args) {
		int alunos;
		ArrayList<Integer> notas = new ArrayList<Integer>();
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de aluno: "));
	
		for(int x = 0; x < alunos; x++) {
			notas.add(Integer.parseInt(JOptionPane.showInputDialog("Informe a nota do aluno "+x)));
		}
		
		ExPagina68Aux aux = new ExPagina68Aux();
		aux.validaNota(notas);
		
		
	}
	
}
