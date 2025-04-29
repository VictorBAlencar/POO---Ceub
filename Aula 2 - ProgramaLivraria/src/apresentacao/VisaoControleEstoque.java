package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Estante;
import negocio.Produto;

public class VisaoControleEstoque {
	
	public static void main(String[] args) {
		
		//Declaracao de Variaveis
		
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Produto objProduto = new Produto();
		
		//Entrada de Dados
		
		try {
			System.out.print("Digite o nome do produto: ");
			objProduto.setNome(leitor.readLine());
			
			System.out.print("Digite o numero da estante: ");
			objProduto.setObjEstante(new Estante(Integer.parseInt(leitor.readLine()))); // le de tras pra frente --> leitor --> integer.parseint(converter para int) --> cria New Estante  --> set 
			
			System.out.print("Digite a quantidade de produtos: ");
			objProduto.setQuantidade(Integer.parseInt(leitor.readLine()));
			
		}catch(Exception erro) {System.out.println(erro);
			}
		
		//Saida de Dados
		
		System.out.println("Nome do produto: " + objProduto.getNome());
		System.out.println("Estante: " + objProduto.getObjEstante().getNumero());
		System.out.println("Quantidade: " + objProduto.getQuantidade());
	}
}