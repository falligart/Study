package Lab;

import OrientacaoObjeto.Pessoa;

public class Exemplo1Modulo8Array {
	
	public static void main(String[] args) {
		
		Exemplo1Modulo8classePessoa pessoas[] = new Exemplo1Modulo8classePessoa[2];
		pessoas[0] = new Exemplo1Modulo8classePessoa();
		pessoas[0].altura = 1.67;
		pessoas[0].peso = 70;
		pessoas[1] = new Exemplo1Modulo8classePessoa();
		pessoas[1].altura = 1.55;
		pessoas[1].peso = 60;
		
		System.out.println(pessoas[0]);
		System.out.println(pessoas[1]);
		
	}

}
