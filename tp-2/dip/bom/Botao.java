package dip.bom;

public class Botao {
	
	private ILampada lampada;
	
	public void acionar() {
		if (lampada.isLigada()) {
			lampada.desligar();
		} else {
			lampada.ligar();
		}
	}
	
}
