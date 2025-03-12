package negocio;

public class Carro extends Veiculo {
	//Propriedades
	
	private boolean tetoSolar = false;

	//Construtores
	

	public Carro() {
		super();
	}

	public Carro(String modelo, Fabricante objFabricante, String cor, boolean tetoSolar) {
		super(modelo, objFabricante, cor);
		this.tetoSolar = tetoSolar;
	}
		
	//Acesso
	
	public boolean isTetoSolar() { //normalmente troca get por is(boolean)
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

}
