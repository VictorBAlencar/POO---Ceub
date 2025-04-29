package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class VisaoAmazon {
	public static void main(String[] args) {
		//Declaracao de Variaveis
		
		BufferedReader leitor = new BufferedReader( 	//Para ler input do teclado\\
								new InputStreamReader(System.in));
		Compra objCompra = new Compra();
		Produto objProduto = new Produto();
		
		//Entrada de Dados
		
		try {
			System.out.print("Informe o nome do produto: ");
			objProduto.setNome(leitor.readLine()); //le string e associa ao produto
			
			System.out.print("Informe o tipo do produto: ");
			objProduto.setObjTipo(new Tipo(leitor.readLine())); //le string e cria um novo tipo --> depois associa ao produto
			
			System.out.print("Informe o preco do produto: ");
			objProduto.setPreco(Double.parseDouble(leitor.readLine())); //le um texto e converte para fracionario --> associa ao Produto
																		// parse --> converte(int, double, char, etc)
			
			objCompra.setObjProduto(objProduto);
			
			System.out.print("Informe a quantidade de produtos: ");
			objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Informe a data da compra: ");
			objCompra.setData(leitor.readLine());
			
			System.out.print("Informe o numero do cartao da compra: ");
			objCompra.setCartao(leitor.readLine());
			
		} catch(Exception erro) {
			System.out.println("ERRO" + erro);
		}
		
		//Saida de Dados
		
		System.out.println("Produto: " + objCompra.getObjProduto().getNome());
		
		System.out.println("Tipo: " + objCompra.getObjProduto().getObjTipo().getDescricao());
		
		System.out.println("Data: " + objCompra.getData());
		
		System.out.println("Valor Total: " + objCompra.getQuantidade() * objCompra.getObjProduto().getPreco());
	}
}
