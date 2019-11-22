
public class AutenticacaoUtil implements Autenticavel {

	private int senha;
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {		
			return true;
		}
		System.out.println("Senha errada");
		return false;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}

}
