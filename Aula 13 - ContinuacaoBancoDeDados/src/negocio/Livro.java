package negocio;

import persistencia.LivroDAO;

public class Livro {
	
	private int idLivro = 0;
	private String titulo = "";
	private Autor objAutor = null;
	
	//Construtores
	
	public Livro(int idLivro, String titulo, Autor objAutor) {
		super();
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.objAutor = objAutor;
	}
	public Livro() {
		super();
	}
	
	//Acesso
	
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getObjAutor() {
		return objAutor;
	}
	public void setObjAutor(Autor objAutor) {
		this.objAutor = objAutor;
	}
	
	//Metodos
	
	public void persistir() throws Exception{
		new LivroDAO().persistir(this);
	}
}
