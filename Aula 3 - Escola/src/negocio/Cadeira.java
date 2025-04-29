package negocio;

public class Cadeira {
	//Propriedades
	
	private String nome = "";

	//Construtores
	
	public Cadeira(String nome) {
		this.nome = nome;
	}

	public Cadeira() {
	}

	//Acesso
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
