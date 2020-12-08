package sip.bom;

public interface ICalculadoraSalario {
	
	static double calcularSalario(Funcionario funcionario) {
		return funcionario.getCargo().getMultiplicadorSalario() * funcionario.getSalarioBase();
	}

}
