package negocio;

public class Cilindro implements Solido{
	
	//Propriedades
	
	private double raio = 0;
	private double altura = 0;

	//Construtores
	
	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}

	public Cilindro() {
		super();
	}

	//Acesso
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
		
	//Implementacoes
	
	public double CalcularArea(){
		return(2 * Math.PI * Math.pow(getRaio(), 2)) + 2 * Math.PI * getAltura();
	}
	
	public double CalcularVolume() {
		return(Math.PI * Math.pow(getRaio(), 2) * getAltura());
	}
}
