package negocio;

public abstract class Mamifero extends Animal {
	//Propriedades
	
	private int litrosLeite = 0;

	//Construtores
	
	public Mamifero(double peso, double altura, String nome, int litrosLeite) {
		super(peso, altura, nome);
		this.litrosLeite = litrosLeite;
	}

	public Mamifero() {
		super();
	}

	//Acesso
	
	public int getLitrosLeite() {
		return litrosLeite;
	}

	public void setLitrosLeite(int litrosLeite) {
		this.litrosLeite = litrosLeite;
	}
	
}
