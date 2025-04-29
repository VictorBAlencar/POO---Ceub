package negocio;

public class Produto {
	
	//Propriedades da Classe
	
	private String nome ="";
	private Estante objEstante = null;
	private int quantidade = 0;
	
	//Construtores da Classe
	
	public Produto() {
	
	}

	public Produto(String nome, Estante objEstante, int quantidade) {
		this.nome = nome;
		this.objEstante = objEstante;
		this.quantidade = quantidade;
	}

	//Metodo de Acesso a Classe
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estante getObjEstante() {
		return objEstante;
	}

	public void setObjEstante(Estante objEstante) {
		this.objEstante = objEstante;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
