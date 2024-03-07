package conta.model;

public class ContaPoupanca extends Conta {
	
	private int aniversario;

	public ContaPoupanca(int numero, int agenciaConta, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agenciaConta, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}

}
