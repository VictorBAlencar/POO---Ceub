package negocio;

import java.util.Collection;

import persistencia.ProdutoDAO;

public class Produto {
	
	//Propriedades
	
	private int id = 0;
	private String nome = "";
	private double preco = 0;

	//Construtores
	
	public Produto(int id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public Produto() {
		super();
	}

	//Acesso
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	//Metodos
	
	public static Collection <Produto> getTodos() throws Exception{
		return new ProdutoDAO().getTodos();
	}
}
