package Lab;

public class Exercicio2Modulo8classePrincipal {

	public static void main(String[] args) {
		double media = 0;
		int aux = 0;
		int soma = 0;
		if(args.length > 0) {			
			for(int i = 0; i < args.length; i++) {
			soma+= Integer.parseInt(args[i]);
			}
		}else {System.out.println("Informe um valor valido!");}	
		
		media = soma / args.length;
		System.out.println(media);

	}
	
}
