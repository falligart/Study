package Desafios;

public class RegistrodeNascimento {

	private String nome;
	private String nomeMae;
	private String sexo;
	private int gestacao;
	private boolean uti;

	public RegistrodeNascimento() {
		super();
		this.gestacao = 9;
		this.uti = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getGestacao() {
		return gestacao;
	}

	public void setGestacao(int gestacao) {
		this.gestacao = gestacao;
	}

	public boolean isUti() {
		return uti;
	}

	public void setUti(boolean uti) {
		this.uti = uti;
	}

}
