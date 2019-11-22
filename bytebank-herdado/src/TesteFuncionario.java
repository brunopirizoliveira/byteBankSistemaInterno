
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		
		nico.setCpf("21849494949");
		nico.setNome("Nico Steppet");
		nico.setSalario(5800.00);
		System.out.println(nico.getBonificacao());		
		
	}

}
