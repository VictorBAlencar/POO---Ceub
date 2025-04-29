package negocio;

public class Aguia extends Aves{
	//Propriedades
	
	private double autonomia = 0;

	//Construtores
	
	public Aguia() {
		super();
	}

	public Aguia(double peso, double altura, String nome, int quantidadeOvos, double autonomia) {
		super(peso, altura, nome, quantidadeOvos);
		this.autonomia = autonomia;
	}

	//Acesso
	
	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
	//Metodo Adicional
	
	public void voar() {
		System.out.print("fly like an eagle");
	}
}
