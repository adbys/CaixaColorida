
public class CaixaColorida {
	
	private Cor cor;
	private CaixaColorida proxima;
	
	public CaixaColorida (Cor cor){
		this.cor = cor;
		this.proxima = null;
	}
	
	public void empilha(CaixaColorida outraCaixa){
		if (this.proxima == null){
			this.proxima = outraCaixa;
		} else {
			this.proxima.empilha(outraCaixa);
		}
	}
	
	public void imprime(){
		System.out.println(this);
		if (this.proxima != null){
			proxima.imprime();
		}
//		System.out.println(this);
	}
	
	public int sobePilha(Cor cor){
		System.out.println(this.cor);
		int count;
		if (this.cor == cor){
			return 1;
		} else if (this.proxima == null){
			return -1;
		} else {
			
			count =	this.proxima.sobePilha(cor);
			if (count != -1){
				count++;
			}
			
		}
		return count;
	}
	
	public String toString(){
		return this.cor.get();
	}

}
