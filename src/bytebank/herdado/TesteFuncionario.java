package bytebank.herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("lua", "222.222.222-22", 1200);
		System.out.println(gerente.getBonificacao());

		Designer designer = new Designer("lua", "222.222.222-22", 1200);
		System.out.println(designer.getBonificacao());
		
		ControleBonificacao cBon = new ControleBonificacao();
		cBon.registra(gerente);
		cBon.registra(designer);
		System.out.println(cBon.getSoma());
	}

}
