package silas.voador;

public class SuperHomem implements Voador {

	//atributo experiência
	private int experiencia;
	
	//construtor sem parâmetros
	public SuperHomem()
	{
		this.setExperiencia(0);
	}
	
	//método set do atributo experiencia
	public void setExperiencia(int experiencia)
	{
		this.experiencia = experiencia;
	}
	
	//método get do atributo experiência
	public int getExperiencia()
	{
		return this.experiencia;
	}
	
	//implementação do método voar da interface
	public void voar()
	{
		//acrescenta 3 de experiência
		this.setExperiencia(this.getExperiencia() + 3 );
		System.out.println("Estou voando como um campeão");
	}
}
