package negocio;

public class Cubo implements Solido{
	//Propriedades
	
	private double aresta = 0;

	//Construtores
	
	public Cubo(double aresta) {
		super();
		this.aresta = aresta;
	}

	public Cubo() {
		super();
	}
	
	//Acesso
	
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	//Implementacoes
	
	public double CalcularArea() {
		return(6 * Math.pow(getAresta(), 2));
	}
	
	public double CalcularVolume() {
		return(Math.pow(getAresta(), 3));
	}
}
