package EstruturaInterface;

public class Principal {
	public static void main(String[] args) {
		Imprimivel imp = new Relatorio();
		Imprimivel imp2 = new Grafico();
		imp.imprimir();
		imp2.imprimir();
	}
}
