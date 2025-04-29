package negocio;

public class Pessoa 
{
   //Propriedades da classe
	
	private String nome = "";
	private String endereco = "";
	private String telefone = "";
	
	//Metodos Construtores da Classe
	
	public Pessoa() // metodo vazio
	{
		
	}
	
	public Pessoa(String nome, String endereco, String telefone) // metodo cheio 1
	{
		this.nome = nome; //auto referencia
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	/*
	public Pessoa(String aNome, String aEndereco, String aTelefone) // metodo cheio 2
	{
	   	
	}
	*/
	
	//Metodos de Acesso de Classe
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome (String nome) 
	{
		this.nome = nome;
	}
	
	public String getEndereco() 
	{
		return endereco;
	}
	
	public void setEndereco (String endereco) 
	{
		this.endereco = endereco;
	}
	
	public String getTelefone() 
	{
		return telefone;
	}
	
	public void setTelefone (String telefone) 
	{
		this.telefone = telefone;
	}
}
