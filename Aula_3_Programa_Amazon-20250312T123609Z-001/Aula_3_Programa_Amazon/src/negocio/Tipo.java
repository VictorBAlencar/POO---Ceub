package negocio;

public class Tipo {
	
	//Propriedades da Classe
	
	private String descricao ="";

	//Metodos Construtores da Classe
	
	public Tipo(String descricao) {
		this.descricao = descricao;
	}

	public Tipo() {
	}

	//Metodos de Acesso
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
