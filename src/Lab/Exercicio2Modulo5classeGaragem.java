package Lab;

public class Exercicio2Modulo5classeGaragem {

//	1. No mesmo pacote da classe Carro, crie uma classe denominada Garagem;
//	2. Crie dois atributos do tipo Carro nessa classe e nomeie-os de carroPasseio
//	e carroUtilitario;
//	3. Crie a mesma estrutura básica de um programa Java nessa classe (método
//	main(String [] args)) e, dentro desse método, instancie um objeto do próprio
//	tipo Garagem com o nome de “g”;
//	4. Dentro do método main, e utilizando o objeto g, do tipo Garagem, configure
//	valores adequados à sua escolha para os atributos de cada um dos objetos do
//	tipo Carro criados na classe Garagem;
//	5. Imprima na tela os atributos de cada um dos carros criados;
//	6. Compile e execute o programa.
	
	Exercicio2Modulo5classeCarro carroPasseio;
	Exercicio2Modulo5classeCarro carroUtil;
	
	public static void main(String[] args) {
		
		Exercicio2Modulo5classeGaragem g = new Exercicio2Modulo5classeGaragem();
		
		g.carroPasseio  = new Exercicio2Modulo5classeCarro();
		g.carroPasseio.modelo = "Celta";
		g.carroPasseio.cor = "Amarelo";
		g.carroPasseio.potencia = 130;
		
		g.carroUtil  = new Exercicio2Modulo5classeCarro();
		g.carroUtil.cor = "prata";
		g.carroUtil.modelo = "Fox";
		g.carroUtil.potencia = 145;
		
		
		
		System.out.println(g.carroPasseio + "\n"+g.carroUtil);
		
	}
	
}
