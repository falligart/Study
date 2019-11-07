package Lab;

public class Exercicio1Modulo8classeAux {

	public int verificarArray(int valores[]) {
		int maior = 0;
		
		for(int cont : valores) {
			if(cont > maior) {
				maior = cont;
			}else {continue;}
		}		
		return maior;
	}
	
}
