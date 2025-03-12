package negocio;

public class Cachorro extends Mamifero{
	//Propriedades
	
	private double forcaMordida = 0;


	//Construtores
	
	public Cachorro() {
		super();
	}

	public Cachorro(double peso, double altura, String nome, int litrosLeite, double forcaMordida) {
		super(peso, altura, nome, litrosLeite);
		this.forcaMordida = forcaMordida;
	}
	
	//Acesso
	
	public double getForcaMordida() {
		return forcaMordida;
	}

	public void setForcaMordida(double forcaMordida) {
		this.forcaMordida = forcaMordida;
	}
	
	//Metodo Adicional
	
	public void morder() {
		System.out.print("wolf wolf");
	}
}
