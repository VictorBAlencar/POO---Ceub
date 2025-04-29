package negocio;

public class Livro {
	
	//Propriedades da classe
	
	private String titulo = "";
	private Autor objAutor = null; //Trazer uma classe de outro precisa inicializar nulo. Cria uma dependencia.
	private String genero = "";
	
	//Metodos construtotres de classe
	
	public Livro() {
		
	}
	
	public Livro(String titulo, Autor objAutor, String genero) {
		this.titulo = titulo;
		this.objAutor = objAutor;
		this.genero = genero;
	}
	
	//Metodos de Acesso a Classe
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Autor getobjAutor() {
		return objAutor;
	}
	
	public void  setObjAutor(Autor objAutor) {
		this.objAutor = objAutor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
