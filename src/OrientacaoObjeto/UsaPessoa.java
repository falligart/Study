package OrientacaoObjeto;

public class UsaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "jo";
		p1.idade = 15;
		p1.sexo = "F";
		
		
		Carro corolla = new Carro();
		corolla.motorista = p1;
		corolla.ano = 2000;
		corolla.chassi = "19PASKAND02910-1";
		corolla.placa = "SAO-JSJDSM";		

		p1.nacionais = corolla;
		
		System.out.println(p1 + " | "+p1.nacionais);

		
	}

}
