
public class Cliente implements Autenticavel {

	AutenticacaoUtil util = new AutenticacaoUtil();
	
	public Cliente() {
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
