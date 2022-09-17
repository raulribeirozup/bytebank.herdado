package bytebank.herdado;

public class SistemaInterno {
	private int senha = 123;
	
	public void autentica(Autenticavel a) {
		boolean autenticou = a.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Usuário não autenticado.");
		}
	}
}
