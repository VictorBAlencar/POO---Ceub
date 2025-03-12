package negocio;

public class Usado extends Imovel {
	
	//Propriedades
	
	private double depreciacao = 0;

	//Construtores
	
	public Usado() {
		super();
	}

	public Usado(String endereco, double metragem, double valor, double depreciacao) {
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
	}

	//Acesso
	
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	//Sobrescritos/Upper
	
	public double getValor() {
		return(super.getValor() - this.getDepreciacao());
	}
}