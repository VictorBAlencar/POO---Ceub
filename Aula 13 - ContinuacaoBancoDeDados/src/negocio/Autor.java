package negocio;

import java.util.Collection;

import persistencia.AutorDAO;

public class Autor {
	
	private int idAutor = 0;
	private String nome = "";
	
	//Construtores
	
	public Autor(int idAutor, String nome) {
		super();
		this.idAutor = idAutor;
		this.nome = nome;
	}
	
	public Autor() {
		super();
	}
	
	//Acesso

	public int getIdAutor() {
		return idAutor;
	}


	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Metodos
	
	public static Collection<Autor> getTodos() throws Exception{
		return new AutorDAO().getTodos();
	}
}

