
public enum Cor {
	
	VERMELHO("VERMELHO"), PRETO("PRETO"), BRANCO("BRANCO"), AZUL("AZUL"), VERDE("VERDE");
	
	public String cor;
	
	private Cor(String cor){
		this.cor = cor;
	}
	
	public String get(){
		return this.cor;
	}
	
	public String toString(){
		return this.cor;
	}
	
	

}
