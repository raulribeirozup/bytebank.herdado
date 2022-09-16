package bytebank.herdado;

public class Gerente extends Funcionario {

	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}

}
