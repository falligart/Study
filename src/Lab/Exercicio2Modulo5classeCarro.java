package Lab;

public class Exercicio2Modulo5classeCarro {

//	A - Criando uma classe Carro
//	1. Crie uma classe chamada Carro dentro de um pacote denominado carro;
//	2. Defina como atributos dessa classe: modelo, potência do motor e cor;
//	3. Salve a classe.
	
	String modelo;
	String cor;
	int potencia;
	@Override
	public String toString() {
		return "Modelo: "+modelo + " - Cor: " + cor + " - Potencia: " + potencia+"Km/h";
	}
	
	
	
}
