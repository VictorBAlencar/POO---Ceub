package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class VisaoImobiliaria {
	
		//Variaveis
	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(System.in));
		Imovel objImovel = null;
		String opcao = "";
		
		//Entrada
		
		try {
			System.out.print("Digite <N>ovo ou <U>sado: ");
			opcao = leitor.readLine();
			
			if(opcao.equalsIgnoreCase("N")) {
				objImovel = new Novo();
			}else {
				objImovel = new Usado();
			}
			
			System.out.print("Digite o endereco: ");
				objImovel.setEndereco(leitor.readLine());
			
			System.out.print("Digite a metragem: ");
				objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Digite o valor: ");
				objImovel.setValor(Double.parseDouble(leitor.readLine()));
				
			if(opcao.equalsIgnoreCase("N")) {
				System.out.print("Digite o adicional: ");
					((Novo) objImovel).setAdicional(
							Double.parseDouble(leitor.readLine()));			
			} else {
				System.out.print("Digite a depreciacao: ");
					((Usado) objImovel).setDepreciacao(
							Double.parseDouble(leitor.readLine()));
			}	
		} catch(Exception erro) {
			System.out.println("ERRO" + erro);
		}
		
		//Saida
		
		System.out.println("Endereco: " + objImovel.getEndereco());
		System.out.println("Metragem: " + objImovel.getMetragem());
		System.out.println("Valor: " + 	  objImovel.getValor());
	}
}