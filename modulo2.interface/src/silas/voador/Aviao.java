package silas.voador;

//clase avi�o que implementa classe Voador
public class Aviao implements Voador {

	//atributo da classe representando as horas de voo de um avi�o
	private int horasVoo;
	
	
	public Aviao()
	{
		this.setHorasVoo(0); //Inicializa o avi�o com nenhuma hora de voo;
	}
	
	
	//m�todo set do atributo horasVoo
	public void setHorasVoo(int horasVoo)
	{
		this.horasVoo = horasVoo;
		
	}
	
	//m�todo get do atributo horasVoo
	public int getHorasVoo()
	{
		return this.horasVoo; //retorna as horas de voo do avi�o
	}
	
	//implementa��o do m�todo voar() da interface Voado
	public void voar()
	{
		//soma as horas de voo que ele acabou adquirir
		this.setHorasVoo(this.getHorasVoo() + 16);
		System.out.println("Estou voando como um avi�o, e tenho " + this.getHorasVoo() + " horas de voo");
	}
}
