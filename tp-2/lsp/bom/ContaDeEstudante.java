package lsp.bom;

public class ContaDeEstudante implements IContaGenerica {

	private double saldo;
	private int milhas;

	public void deposita(double valor) {
		this.milhas += (int)valor;
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getMilhas() {
		return milhas;
	}	
	
}
