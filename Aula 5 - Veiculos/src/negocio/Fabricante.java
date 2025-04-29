package negocio;

public class Fabricante {
	//Propriedades
	
	private String nome = "";

	//Construtores
	
	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}

	public Fabricante() {
		super();
	}

	//Acesso
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}