package apresentacao;

// ctrl + Shift + O --> importacao automatica.

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Autor;
import negocio.Livro;

public class VisaoLivraria {
	//Declaracao de variaveis
	
	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
	Livro objLivro = new Livro(); // new --> instanciacao
	
	//Entrada de Dados
	
	try {
		System.out.print("Digite o titulo do livro: ");
		objLivro.setTitulo(leitor.readLine());
		
		System.out.print("Digite o nome do autor do livro: ");
		objLivro.setObjAutor(new Autor(leitor.readLine()));
		
		System.out.print("Digite o genero do livro: ");
		objLivro.setGenero(leitor.readLine());
		
		} catch (Exception erro) {/*mensagem de erro ou algo assim*/}
	
	//Saida de Dados
	
	//print ln ---> pula linha.
	
	System.out.println("Titulo: " + objLivro.getTitulo());
	System.out.println("Autor: " + objLivro.getobjAutor().getNome());
	System.out.println("Genero: " + objLivro.getGenero());
	}
}