
public class ControleBonificacao {

	private double soma = 0;

	public void registra(Funcionario funcionario) {
		double bonif = funcionario.getBonificacao();
		this.soma += bonif;
	}	
	
	public double getSoma() {
		return this.soma;
	}
}
