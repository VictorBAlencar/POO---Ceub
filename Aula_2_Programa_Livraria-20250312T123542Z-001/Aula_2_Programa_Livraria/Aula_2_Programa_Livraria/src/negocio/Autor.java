package negocio;

public class Autor {
	
	//Propriedades da Classe
	
	private String nome ="";
	
	//Metodos Construtores da Classe
	
	public Autor() {
		
	}
	
	public Autor(String nome) {
		this.nome = nome;
	}
	
	//Metodo de Acesso a Classe
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
