
public class TestaPolimorfismo {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Bruno");
		gerente.setSalario(5000);		
		ControleBonificacao controle = new ControleBonificacao();		
		controle.registra(gerente);		
		System.out.println("A soma " + controle.getSoma());
				
		EditorVideo editor = new EditorVideo();
		editor.setNome("Guigo");
		editor.setSalario(1500);
		ControleBonificacao controle3 = new ControleBonificacao();
		controle3.registra(editor);		
		System.out.println("A soma " + controle3.getSoma());
		
	}

}
