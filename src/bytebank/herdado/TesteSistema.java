package bytebank.herdado;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente("raul", "12", 12000);
		g.setSenha(13);
		
		Administrador adm = new Administrador("raul", "12", 12000);
		adm.setSenha(123);
		
		Cliente c = new Cliente();
		c.setSenha(321);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(c);
	}

}
