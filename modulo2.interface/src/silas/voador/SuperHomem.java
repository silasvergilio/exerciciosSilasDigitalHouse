package silas.voador;

public class SuperHomem implements Voador {

	//atributo experi�ncia
	private int experiencia;
	
	//construtor sem par�metros
	public SuperHomem()
	{
		this.setExperiencia(0);
	}
	
	//m�todo set do atributo experiencia
	public void setExperiencia(int experiencia)
	{
		this.experiencia = experiencia;
	}
	
	//m�todo get do atributo experi�ncia
	public int getExperiencia()
	{
		return this.experiencia;
	}
	
	//implementa��o do m�todo voar da interface
	public void voar()
	{
		//acrescenta 3 de experi�ncia
		this.setExperiencia(this.getExperiencia() + 3 );
		System.out.println("Estou voando como um campe�o");
	}
}
