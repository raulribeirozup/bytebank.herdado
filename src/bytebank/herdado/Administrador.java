package bytebank.herdado;

public class Administrador extends Funcionario implements Autenticavel {
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
	
	public Administrador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario() + 100;
	}

}
