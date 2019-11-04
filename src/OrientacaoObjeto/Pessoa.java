package OrientacaoObjeto;

public class Pessoa {
	String nome;
	int idade;
	String sexo;
	
	Carro importados;
	Carro nacionais;
	@Override
	
	public String toString() {
		return "Nome: "+nome +" - Idade: " + idade + " - Sexo: " + sexo;
	}
	
	
	
//	public Pessoa(String nome, int idade, String sexo) {
//		super();
//		this.nome = nome;
//		this.idade = idade;
//		this.sexo = sexo;
//	}
//
//	public Pessoa(String nome, int idade, String sexo, Carro[] importados, Carro[] nacionais) {
//		super();
//		this.nome = nome;
//		this.idade = idade;
//		this.sexo = sexo;
//		this.importados = importados;
//		this.nacionais = nacionais;
//	}
	
	

}
