
public class TestGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		Autenticavel referencia = new Gerente();

		
		g1.setSenha(1212);
		boolean autenticou = g1.autentica(1212);
		
		System.out.println(autenticou);
		
	}
}
