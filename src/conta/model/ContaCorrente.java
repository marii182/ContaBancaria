package conta.model;

//Conta corrente herda de conta
public class ContaCorrente extends Conta {
	
	private float limite;

	public ContaCorrente(int numero, int agenciaConta, int tipo, String titular, float saldo, float limite) {
		//método construtor da super classe
		super(numero, agenciaConta, tipo, titular, saldo);
		
		//atributo da classe
		this.limite = limite;
		
			}
	
	//Métodos de Acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//Métodos Especificos
	@Override // override = sobrescrever
	public boolean sacar(float valor) {
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	public void visualizar() {
		// super => chamada da superclasse => Conta.visualizar();
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
		
	}
	

}
