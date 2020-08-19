package modulo2.banco.santander;

public class Cheque {
	
	private final Double valor;
	private final String bancoEmissor;
	private final String data;
	
	public Cheque(Double valor, String bancoEmissor, String data)
	{
		this.valor = valor;
		this.bancoEmissor = bancoEmissor;
		this.data = data;
	}
	
	public Double getValor()
	{
		return this.valor;
	}
	
	public String bancoEmissor()
	{
		return this.bancoEmissor;
	}
	
	public String data()
	{
		return this.data;
	}
	

}
