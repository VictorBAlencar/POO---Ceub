package negocio;

public class Leopardo extends Mamifero{
	//Propriedades
	
	private double velocidade = 0;


	//Construtores
	
	public Leopardo(double peso, double altura, String nome, int litrosLeite, double velocidade) {
		super(peso, altura, nome, litrosLeite);
		this.velocidade = velocidade;
	}

	public Leopardo() {
		super();
	}

	//Acesso
	
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
		
	//Metodo Adicional
	
	public void correr() {
		System.out.print("Run Forest");
	}	
}