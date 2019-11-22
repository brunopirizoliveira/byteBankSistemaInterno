
public class TesteSistemaInterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SistemaInterno si = new SistemaInterno();
		
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador adm = new Administrador();
		adm.setSenha(9078);
		
		Cliente cli = new Cliente();
		cli.setSenha(222);
		
		Fiscal f = new Fiscal();
		f.setSenha(222);
		
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cli);
		si.autentica(f);
	}

}
