package silas.voador;

//Classe que incorpora todos os tipos de voadores
public class TorreDeControle {

	//array que irá armazenar vários objetos voadores
	private Voador[] voadores;
	
	//Construtor 
	public TorreDeControle(Voador[] voadores)
	{
		this.voadores = voadores;
	}
	
	//métoodo que força todos a voares
	public void voemTodos()
	{
		//percorre todo o array
		for(int i  = 0; i < voadores.length; i++)
		{
			voadores[i].voar();
		}
	}
	
	
	
	//método Main
	public static void main(String[] args) {
		
		Voador donald = new Pato(2); //Instância do tipo Pato 
		Voador boeing = new Aviao(); //Instância do tipo Boeing
		SuperHomem clark = new SuperHomem(); //Instância do tipo SuperHomem
		
		Voador time[] = new Voador[3]; //Cria um vetor do tipo Voador
		
		//Insere os objetos no Array
		time[0] = donald;
		time[1] = boeing;
		time[2] = clark;
		
		//Força o avião a voar
		time[1].voar();
		
		
		TorreDeControle torre = new TorreDeControle(time); //Cria o objetivo do tipo TorreDeControle
		torre.voemTodos(); //Força todos a voarem
		
		
	}

}
