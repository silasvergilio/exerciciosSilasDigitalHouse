package modulo02.desafio;

public class PessoaJuridica extends Funcionario {

	private String CNPJ;

	public PessoaJuridica(String endereco, String nome, String cpf, String email, Double salarioBase, String setor) {
		super(endereco, nome, cpf, email, salarioBase, setor);
		this.setCNPJ(CNPJ);
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	
}
