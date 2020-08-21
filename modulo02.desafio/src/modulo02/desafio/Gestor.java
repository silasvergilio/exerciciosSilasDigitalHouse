package modulo02.desafio;

public class Gestor extends PessoaFisica{
	
	private Boolean gerente;
	
	public Gestor(String endereco, String nome, String cpf,
			String email, Double salarioBase, String setor, String NIT,Boolean gerente)
	{
		super(endereco,nome,cpf,email,salarioBase,setor,NIT);
		this.gerente = gerente;
		if(gerente) this.setHierarquia(2);
		else this.setHierarquia(1);
	}

	public Double getBonificacao()
	{
		if(this.getHierarquia() == 1) return this.getSalarioBase()*1.08;
		else if(this.getHierarquia() == 2) return this.getSalarioBase()*1.12;
		else return 0.0;
	}
	
	public void reajusteSalarial(Funcionario funcionario, Double percentual)
	{
		if(this.getHierarquia() > funcionario.getHierarquia()) {
			Double reajuste = funcionario.getSalarioBase()*(percentual/100.0);
			funcionario.setSalarioBase(reajuste);
		}
		else System.out.println("O funcionário " + this.getNome() + " não pode reajustar o salário do funcionário " + funcionario.getNome());
	
	}
	
	public void Demitir(Funcionario funcionario)
	{
		if(this.getHierarquia() > funcionario.getHierarquia()) funcionario.pedirDemissao();
		else System.out.println("O funcionário " + this.getNome() + " não pode demitir o funcionário " + funcionario.getNome());
	}
	
}
