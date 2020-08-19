package modulo2.banco.santander; //nome pacote

public class Cliente {  //Declaração da classe
	
	private String numeroCliente;
	private String sobrenome;
	private String rg;
	private String cpf;
	
	
	
	public Cliente(String numeroCliente, String sobrenome
			, String rg, String cpf)
	{
		setNumeroCliente(numeroCliente);
		setSobrenome(sobrenome);
		setRg(rg);
		setCpf(cpf);
	}
	
	public void setNumeroCliente(String numeroCliente)
	{
		this.numeroCliente = numeroCliente;	
	}
	
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	
	public void setRg(String rg)
	{
		this.rg = rg;
	}
	
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	
	public String getNumeroCliente()
	{
		return this.numeroCliente;
	}
	
	public String getSobrenome()
	{
		return this.sobrenome;
	}
	
	public String getRg()
	{
		return this.rg;
	}
	
	public String getCpf()
	{
		return this.cpf;
	}

}
