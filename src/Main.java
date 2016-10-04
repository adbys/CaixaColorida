
public class Main {
	
	public static void main(String[] args) {
		CaixaColorida caixa1 = new CaixaColorida(Cor.AZUL);
		CaixaColorida caixa2 = new CaixaColorida(Cor.VERMELHO);
		CaixaColorida caixa3 = new CaixaColorida(Cor.PRETO);
		CaixaColorida caixa4 = new CaixaColorida(Cor.VERDE);
		
		caixa1.empilha(caixa2);
		caixa1.empilha(caixa3);
		caixa1.empilha(caixa4);
		
		caixa1.imprime();
		
		System.out.println("final: " + caixa1.sobePilha(Cor.VERDE));
	}

}
