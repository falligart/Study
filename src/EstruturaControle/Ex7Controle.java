package EstruturaControle;

public class Ex7Controle {
	
	public static void main(String[] args) {
		
		int controle = 0;
		
		while(controle < 10) {
			
			++controle;
			if(controle == 5) continue;
			//continue; interrompe o laço voltando para a estrutura de controle desdo começo;
			
			System.out.println("valor de num = "+controle);
		}
		
	}

}
