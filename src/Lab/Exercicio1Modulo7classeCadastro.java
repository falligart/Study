package Lab;


public class Exercicio1Modulo7classeCadastro {

	private String nome;
	private String sobrenome;
	private int idade;
	
	public Exercicio1Modulo7classeCadastro(String nome, String sobrenome, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public Exercicio1Modulo7classeCadastro(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Exercicio1Modulo7classeCadastro() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void mostrar() {
		System.out.println("#####################");
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSobrenome());
		
	}	
	
	
}
