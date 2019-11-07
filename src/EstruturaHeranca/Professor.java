package EstruturaHeranca;

public class Professor extends Pessoa {
	
	private double salario;
	private String disciplina;
	
	
	
	public Professor(String nome, int idade, char sexo, RG rg, double salario, String disciplina) {
		super(nome, idade, sexo, rg);
		super.setNome(nome);
		super.setIdade(idade);
		super.setSexo(sexo);
		super.setRg(rg);
		this.salario = salario;
		this.disciplina = disciplina;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String falar(String aluno) {		
		return getNome()+": "+aluno+"?";
	}
	public String mostrarDados() {		
		return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nSexo: "+getSexo()+"\nSalario: "+getSalario()+"\nRG: "+getRg()+""+ "\nDisciplina: "+getDisciplina();		
	}

	@Override
	public String toString() {
		return "Professor [salario=" + salario + ", disciplina=" + disciplina + "]";
	}
	
	
	
	

}
