package Lab;

public class Exercicio3Modulo6classePrincipal {

	public static void main(String[] args) {
		Exercicio3Modulo6classeAluno joao = new Exercicio3Modulo6classeAluno();
		Exercicio3Modulo6classeAluno maria = new Exercicio3Modulo6classeAluno();
		Exercicio3Modulo6classeAluno marcos = new Exercicio3Modulo6classeAluno();
		
		
		
		joao.setNome("Joao");
		joao.contadorAluno = 1;
		joao.imprimeAluno(joao.getNome());
		System.out.println("ID: "+joao.contadorAluno);
		
		marcos.contadorAluno =2;
		marcos.setNome("Marcos");
		joao.imprimeAluno(marcos.getNome());
		System.out.println("ID: "+marcos.contadorAluno);
		
		maria.contadorAluno =3;
		maria.setNome("Maria");
		joao.imprimeAluno(maria.getNome());
		System.out.println("ID: "+maria.contadorAluno);
		
		
		System.out.println("Contador acessado diretamente: "+Exercicio3Modulo6classeAluno.contadorAluno);
		

		
		
	}
}
