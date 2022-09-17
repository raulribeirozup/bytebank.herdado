package bytebank.herdado;

public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) return true;
		return false;
	}
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}

}
