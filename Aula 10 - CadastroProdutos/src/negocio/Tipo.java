package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Tipo {
	//Propriedades
	
	private String descricao = "";

	//Construtores
	
	public Tipo() {
		super();
	}
	
	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}

	//Acesso
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//Metodos
	
	public static Collection<Tipo> getTodos() throws Exception { //throws Exception = try(catch)
		ArrayList<Tipo> colecao = new ArrayList<Tipo>();
		
		colecao.add(new Tipo("Livro"));
		colecao.add(new Tipo("Eletrônico"));
		colecao.add(new Tipo("Alimentação"));
		colecao.add(new Tipo("Brinquedo"));
		colecao.add(new Tipo("Eletrodoméstico"));
		colecao.add(new Tipo("Periférico"));

		return colecao;
	}
}
