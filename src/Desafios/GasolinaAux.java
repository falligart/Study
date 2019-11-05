package Desafios;

public class GasolinaAux {
	
	private double total = 0;
	private String recomendado;
	
	public String preco(double...list) {

		for(double l : list) {
			setTotal(total /= l);
		}
		
		if(getTotal() < 0.7) {
			setRecomendado("Etanol é a melhor opção.");
		}else {
			setRecomendado("Gasolina é a melhor opção");
		}
		
		return getRecomendado();
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getRecomendado() {
		return recomendado;
	}

	public void setRecomendado(String recomendado) {
		this.recomendado = recomendado;
	}
	
	

}
