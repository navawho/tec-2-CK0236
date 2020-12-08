package dip.bom;

public class Lampada implements ILampada {
	
	private boolean ligada;

	public boolean isLigada() {
		return ligada;
	}
	
	public void ligar() {
		this.ligada = true;
		System.out.println("Lâmpada ligada");
	}

	public void desligar() {
		this.ligada = false;
		System.out.println("Lâmpada desligada");
	}

}
