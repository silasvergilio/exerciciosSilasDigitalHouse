package modulo2.banco.santander;

public abstract class Conta {
	
	protected Cliente clienteConta;
	protected Double saldo;
	
	public Conta(Cliente clienteConta, Double saldo)
	{
		this.clienteConta = clienteConta;
		this.saldo = saldo;
	}
	
	public abstract void Depositar(Double valor);
	public abstract void Sacar(Double valor);
	
	public Double ConsultarSaldo()
	{
		return this.saldo;
	}
	
	

}
