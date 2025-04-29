package negocio;

public abstract class Aves extends Animal{
	//Propriedades
	
	private int quantidadeOvos = 0;

	//Construtores
	
	public Aves() {
		super();
	}

	public Aves(double peso, double altura, String nome, int quantidadeOvos) {
		super(peso, altura, nome);
		this.quantidadeOvos = quantidadeOvos;
	}

	//Acesso
	
	public int getQuantidadeOvos() {
		return quantidadeOvos;
	}

	public void setQuantidadeOvos(int quantidadeOvos) {
		this.quantidadeOvos = quantidadeOvos;
	}
	
}
