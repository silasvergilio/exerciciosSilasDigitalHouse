package modulo02.desafio;

public class PessoaFisica extends Funcionario {
	
	private String NIT;
	
	public PessoaFisica(String endereco, String nome, String cpf,
			String email, Double salarioBase, String setor, String NIT)
	{
		super(endereco, nome,cpf,email,salarioBase,setor);
		setNIT(NIT);
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
	}

	
}
