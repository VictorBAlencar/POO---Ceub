package negocio;

public class Estante {
	
	//Propriedades da Classe
	
	private int numero = 0;

	//Construtores da Classe
	
	public Estante() {
		
	}

	public Estante(int numero) {
		this.numero = numero;
	}

	//Metodos de Acesso a Classe
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
