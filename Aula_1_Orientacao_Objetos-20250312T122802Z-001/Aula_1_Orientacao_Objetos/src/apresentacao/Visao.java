package apresentacao;

import negocio.Pessoa;

//Sintaxe Java Instanciacao de Objetos
//Classe Objeto = New Construtor(); vazio ou cheio

public class Visao 
{
  public static void main (String[] args) 
  {
	  Pessoa obj1 = new Pessoa(); //vazio
	   obj1.setNome("a");
	   obj1.setEndereco("bbbbb");
	   obj1.setTelefone("11111");
	   
	  Pessoa obj2 = new Pessoa("x", "y", "z");
	  
	  System.out.println("Nome do objeto 1: " + obj1.getNome());
	  System.out.println("Nome do objeto 2: " + obj2.getNome());
  }
  
}