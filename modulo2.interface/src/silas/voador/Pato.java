package silas.voador;

//classe Pato que implementa a interface Voador
public class Pato implements Voador {

	
	private int energia; //Energia que o pato usa para voar
	
	//Construtor sem par�metros
	public Pato () 
	{
		setEnergia(100); //Inicializa a energia
	}
	
	
	public void setEnergia(int energia) //m�todo set do atributo 'energia'
	{
		this.energia = energia;
	}
	
	public int getEnergia() //M�todo Get do atributo Energia
	{
		return this.energia; //retorna o valor do atributo energia
	}
	
	//Construtor com par�metros para poder inicializar o pato com diferentes valores de energia
	public Pato (int energia) 
	{
		this.energia = energia;
	}
	
	public void voar()
	{
		if(this.getEnergia() >= 5)
		{
			this.setEnergia(this.getEnergia() - 5);
			System.out.println("Estou voando como um pato");
		}
		
		else 
		{
			System.out.println("N�o tenho energia suficiente para voar");
		}
	}
	
	
}
