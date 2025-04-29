package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Uf {
	//Propriedades
	private String sigla = "";

	//Construtores
	
	public Uf(String sigla) {
		super();
		this.sigla = sigla;
	}

	public Uf() {
		super();
	}
	
	//Acesso
	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	//Classe
	
	public static Collection<Uf> getTodos() throws Exception{
		ArrayList<Uf> colecao = new ArrayList<Uf>();
		
		colecao.add(new Uf("AC"));
		colecao.add(new Uf("DF"));
		colecao.add(new Uf("ES"));
		colecao.add(new Uf("SP"));
		colecao.add(new Uf("RS"));
		
		return colecao;
	}
}
