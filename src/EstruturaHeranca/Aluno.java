package EstruturaHeranca;

public class Aluno extends Pessoa{
	private double mensalidade;
	private String curso;
	
	public Aluno(String nome, int idade, char sexo, RG rg, double mensalidade, String curso) {
		super(nome, idade, sexo, rg);
		super.setNome(nome);
		super.setIdade(idade);
		super.setSexo(sexo);
		super.setRg(rg);
		this.mensalidade = mensalidade;
		this.curso = curso;
	}
	
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;	}

	
	public String falar(String aluno) {		
		return getNome()+": "+"Presente";
	}
	public String mostrarDados() {		
		return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nSexo: "+getSexo()+"\nMensalidade: "+getMensalidade()+"\nRG: "+getRg()+""+ "\nCurso: "+getCurso();		}

	
	
}
