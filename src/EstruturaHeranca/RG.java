package EstruturaHeranca;

public class RG {
	private int numero;
	private String dataNasck;	
	
	public RG(int numero, String dataNasck) {
		super();
		this.numero = numero;
		this.dataNasck = dataNasck;
	}	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataNasck() {
		return dataNasck;
	}
	public void setDataNasck(String dataNasck) {
		this.dataNasck = dataNasck;
	}

	@Override
	public String toString() {
		return "RG ("+ numero + ", " + dataNasck + ")";
	}
	
	
	
	

}
