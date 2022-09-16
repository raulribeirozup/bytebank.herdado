package bytebank.herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("raul", "222.222.222-22", 1200);
		System.out.println(funcionario.getBonificacao());
		Gerente gerente = new Gerente("lua", "222.222.222-22", 1200);
		System.out.println(gerente.getBonificacao());
	}

}
