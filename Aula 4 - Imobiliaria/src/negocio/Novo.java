package negocio;

public class Novo extends Imovel{

	//Propriedades
	
	private double adicional = 0;

	//Construtores
	
	public Novo() {
		super();
	}

	public Novo(String endereco, double metragem, double valor, double adicional) {
		super(endereco, metragem, valor);
		this.adicional = adicional;
	}

	//Acesso
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//Sobrecritos/Upper
	
	public double getValor() {
		return(super.getValor() + this.getAdicional());
	}
}