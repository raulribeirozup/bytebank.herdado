package bytebank.herdado;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente("raul", "12", 12000);
		g.setSenha(13);
		
		Administrador adm = new Administrador("raul", "12", 12000);
		adm.setSenha(123);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
	}

}
