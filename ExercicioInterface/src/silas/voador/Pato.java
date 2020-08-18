package silas.voador;

//classe Pato que implementa a interface Voador
public class Pato implements Voador {

	
	private int energia; //Energia que o pato usa para voar
	
	//Construtor sem parâmetros
	public Pato () 
	{
		setEnergia(100); //Inicializa a energia
	}
	
	
	public void setEnergia(int energia) //método set do atributo 'energia'
	{
		this.energia = energia;
	}
	
	public int getEnergia() //Método Get do atributo Energia
	{
		return this.energia; //retorna o valor do atributo energia
	}
	
	//Construtor com parâmetros para poder inicializar o pato com diferentes valores de energia
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
			System.out.println("Não tenho energia suficiente para voar");
		}
	}
	
	
}
