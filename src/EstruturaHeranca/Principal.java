package EstruturaHeranca;

public class Principal {
public static void main(String[] args) {
	RG rg1 = new RG(93109283, "01/12/1996");
	RG rg2 = new RG(53217645, "21/02/2005");
	RG rg3 = new RG(40982384, "11/10/1998");
	
	Pessoa professor = new Professor("Bernardo", 38, 'm', rg1, 9820.21, "SI");
	Pessoa aluno1 = new Aluno("Lorena", 16, 'f', rg2, 792.01, "SI");
	Pessoa aluno2 = new Aluno("Luis", 20, 'm', rg3, 684.92, "SI");
	
	System.out.println(professor.falar(aluno1.getNome()));
	System.out.println(aluno1.falar(aluno1.getNome()));
	System.out.println(professor.falar(aluno2.getNome()));
	System.out.println(aluno2.falar(aluno2.getNome()));
	System.out.println("--------------------");	
	System.out.println(professor.mostrarDados());
	System.out.println("--------------------");
	System.out.println(aluno1.mostrarDados());
	System.out.println("--------------------");
	System.out.println(aluno2.mostrarDados());
	System.out.println("--------------------");
	
}
}
