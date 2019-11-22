
public class Fiscal implements Autenticavel{

	AutenticacaoUtil util = new AutenticacaoUtil();
	
	public Fiscal() {
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

}
