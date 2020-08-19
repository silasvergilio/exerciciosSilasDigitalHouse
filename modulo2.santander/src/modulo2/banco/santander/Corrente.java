package modulo2.banco.santander;

import java.util.ArrayList;

public class Corrente extends Conta {

	private Double chequeEspecial;
	private ArrayList<Cheque> chequesConta = new ArrayList<>();
	
	public Corrente(Cliente clienteConta, Double saldo, Double chequeEspecial)
	{
		super(clienteConta,saldo);
		setChequeEspecial(chequeEspecial);
	}
	
	public void setChequeEspecial(Double chequeEspecial)
	{
		this.chequeEspecial = chequeEspecial;
	}
	
	public Double getChequeEspecial()
	{
		return this.chequeEspecial;
	}
	
	public void Depositar(Double valor)
	{
		this.saldo += valor;
	}
	
	public void Sacar(Double valor)
	{
		if(this.ConsultarSaldo() + this.getChequeEspecial() > valor)
		{
			if(this.ConsultarSaldo() <= valor) this.saldo -= valor;
			else
			{
				valor -= this.ConsultarSaldo();
				this.saldo = 0.0;
				this.setChequeEspecial(this.getChequeEspecial() - valor);
			}
		}
	}
	
	public void DepositarCheques(Double valor, String bancoEmissor, String data)
	{
		Cheque chequeDepositado = new Cheque(valor, bancoEmissor,data);
		chequesConta.add(chequeDepositado);
		this.Depositar(chequeDepositado.getValor());
	}
}

