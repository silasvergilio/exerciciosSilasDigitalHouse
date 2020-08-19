package modulo2.banco.santander;

public class Poupanca extends Conta {

	private Double taxaJuros;
	
	public Poupanca(Cliente clienteConta,Double saldo, Double taxaJuros)
	{
		super(clienteConta,saldo);
		setTaxaJuros(taxaJuros);
	}
	
	public void setTaxaJuros(Double taxaJuros)
	{
		this.taxaJuros = taxaJuros;
	}
	
	public Double getTaxaJuros()
	{
		return this.taxaJuros;
	}
	
	public void Depositar(Double valor)
	{
		this.saldo += valor;
	}
	
	public void Sacar(Double valor)
	{
		if(this.ConsultarSaldo() > valor)
		{
			this.saldo -= valor;
		}
	}
	
	public void RecolherJuros(double meses)
	{
		Double jurosRecolhidos = this.taxaJuros * meses*this.ConsultarSaldo();
		this.Depositar(jurosRecolhidos);
	}
	
	
}
