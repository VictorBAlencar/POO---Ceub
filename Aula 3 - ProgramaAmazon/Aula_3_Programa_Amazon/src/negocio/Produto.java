package negocio;

public class Produto {

	//Propriedades do Produto
	
	private String nome = "";
	private Tipo objTipo = null;
	private double preco = 0;
	
	//Metodos Construtores
	
	public Produto(String nome, Tipo objTipo, double preco) {
		this.nome = nome;
		this.objTipo = objTipo;
		this.preco = preco;
	}

	//Metodos de Acesso
	
	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getObjTipo() {
		return objTipo;
	}

	public void setObjTipo(Tipo objTipo) {
		this.objTipo = objTipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
