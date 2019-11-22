
public class Gerente extends Funcionario implements Autenticavel {

	AutenticacaoUtil util = new AutenticacaoUtil();
	
	public Gerente() {
		this.util = new AutenticacaoUtil();
	}
	
	@Override
	public boolean autentica(int senha) {
		boolean autenticou = util.autentica(senha);
		return autenticou;
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);		
	}
	
	public double getBonificacao() {
		System.out.println("BONIFICAÇÃO DO GERENTE!");
		return 1000;
	}

}
