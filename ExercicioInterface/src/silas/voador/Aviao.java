package silas.voador;

//clase avião que implementa classe Voador
public class Aviao implements Voador {

	//atributo da classe representando as horas de voo de um avião
	private int horasVoo;
	
	
	public Aviao()
	{
		this.setHorasVoo(0); //Inicializa o avião com nenhuma hora de voo;
	}
	
	
	//método set do atributo horasVoo
	public void setHorasVoo(int horasVoo)
	{
		this.horasVoo = horasVoo;
		
	}
	
	//método get do atributo horasVoo
	public int getHorasVoo()
	{
		return this.horasVoo; //retorna as horas de voo do avião
	}
	
	//implementação do método voar() da interface Voado
	public void voar()
	{
		//soma as horas de voo que ele acabou adquirir
		this.setHorasVoo(this.getHorasVoo() + 16);
		System.out.println("Estou voando como um avião, e tenho " + this.getHorasVoo() + " horas de voo");
	}
}
