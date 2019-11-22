
public class SistemaInterno {

	private int senha = 222;
	
	public void autentica(Autenticavel f) {
		boolean autenticou = f.autentica(this.senha);
		if(autenticou) {
			System.out.println("Logado");
		} else {
			System.out.println("Tente novamente");
		}
	}
	

}
