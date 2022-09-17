package bytebank.herdado;

public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;	
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); 
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public Administrador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return super.getSalario() + 100;
	}

}
