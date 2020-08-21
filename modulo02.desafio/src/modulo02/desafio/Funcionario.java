package modulo02.desafio;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Funcionario {

	private String endereco;
	private String nome;
	private String cpf;
	private String email;
	private final LocalDate dataAdmissao;
	private LocalDate dataDemissao = null;
	private LocalDate dataUltimaFerias = null;;
	private Double salarioBase;
	private String cargo;
	private Boolean ferias = false;
	private String setor;
	private int hierarquia;
	
	public Funcionario(String endereco, String nome, String cpf,
			String email, Double salarioBase, String setor)
	{
		this.setEndereco(endereco);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEmail(email);
		this.dataAdmissao = LocalDate.now();
		this.setSalarioBase(salarioBase);
		this.setSetor(setor);
		this.setCargo(cargo);
		this.setHierarquia(0);	
	}

	
	@Override
	public String toString() {
		return "Funcionario [endereco=" + endereco + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email
				+ ", dataAdmissao=" + dataAdmissao + ", dataDemissao=" + dataDemissao + ", dataUltimaFerias="
				+ dataUltimaFerias + ", salarioBase=" + salarioBase + ", cargo=" + cargo + ", ferias=" + ferias
				+ ", setor=" + setor + ", hierarquia=" + (hierarquia == 0?"Funcionário Comum":hierarquia==1?"Supervisor":"Gerente") + "]";
	}


	public int getHierarquia() {
		return hierarquia;
	}


	protected void setHierarquia(int hierarquia) {
		this.hierarquia = hierarquia;
	}


	public void pedirFerias()
	{
		if( !this.getFerias())
		{
			Period periodoEmpresa = Period.between(this.getDataAdmissao(), LocalDate.now());
			Period periodoUltimaFerias = Period.between(this.dataUltimaFerias,LocalDate.now());
			if( (periodoEmpresa.getMonths() >= 11) && ( (periodoUltimaFerias.getMonths() >= 4) || (this.dataUltimaFerias == null) ) )
			{
				this.setFerias(true);
				this.dataUltimaFerias = LocalDate.now();
			}
		}
		else
		{
			System.out.println("Funcionário já está de férias");
		}
	}	
	
	public void trabalhar()
	{
		if(!ferias) System.out.println("O funcionário está trabalhando");
		else System.out.println("O funcionário está de férias e não pode trabalhar");
	}
	
	public void pedirDemissao()
	{
		this.dataDemissao = LocalDate.now();
	}
	
	public void pedirAumento()
	{
		 Random r = new Random();
		if(r.nextDouble() >= 0.5) setSalarioBase(this.getSalarioBase()*1.1);
		else System.out.println("Hoje não será possível obter o aumento");
	}
	
	public Boolean getFerias()
	{
		return this.ferias;
	}
	
	
	
	public void setFerias(Boolean ferias)
	{
		this.ferias = ferias;
	}
	
	public String getCargo()
	{
		return this.cargo;
	}
	
	public void setCargo(String cargo)
	{
		this.cargo = cargo;
	}
	
	public String getSetor()
	{
		return this.setor;
	}
	
	public void setSetor(String setor)
	{
		this.setor = setor;
	}
	
	public Double getSalarioBase()
	{
		return this.salarioBase;
	}
	
	public void setSalarioBase(Double salarioBase)
	{
		this.salarioBase = salarioBase;
	}
	
	public LocalDate getDataAdmissao()
	{
		return this.dataAdmissao;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
