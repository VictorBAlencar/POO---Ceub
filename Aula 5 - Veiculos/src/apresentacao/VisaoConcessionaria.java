package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Carro;
import negocio.Fabricante;
import negocio.Moto;
import negocio.Veiculo;

public class VisaoConcessionaria {
	
	//Variaveis
	
		public static void main(String[] args) {
			BufferedReader leitor = new BufferedReader(
									new InputStreamReader(System.in));
			Veiculo objVeiculo = null;
			String opcao = "";

	//Entrada
	
			try {
				System.out.print("Digite <C> para carro ou <M> para moto: ");
					opcao = leitor.readLine();
					
			if(opcao.equalsIgnoreCase("C")) {
				objVeiculo = new Carro();
			}else {
				objVeiculo = new Moto();
			}
			
			System.out.print("Digite o modelo: ");
				objVeiculo.setModelo(leitor.readLine());
			System.out.print("Digite o fabricante: ");
				objVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));
			System.out.print("Digite a cor: ");
				objVeiculo.setCor(leitor.readLine());
			
			if(opcao.equalsIgnoreCase("C")) {
				System.out.print("Digite <S> se tiver teto solar: ");
					((Carro) objVeiculo).setTetoSolar(
								leitor.readLine().equalsIgnoreCase("S"));
			} else {
				System.out.print("Digite a cilindrada: ");	
					((Moto) objVeiculo).setCilindrada(
							Integer.parseInt(leitor.readLine()));
			}
			
			} catch (Exception erro) {
				System.out.println(erro);
		}
			//Saida
			
			System.out.println("Modelo: " + objVeiculo.getModelo());
			System.out.println("Fabricante " + objVeiculo.getObjFabricante().getNome());
			System.out.println("Cor: " + objVeiculo.getCor());
			
			if(opcao.equalsIgnoreCase("C")) {
				System.out.println("Teto Solar: " + (((Carro)objVeiculo).isTetoSolar() ? "SIM" : "NAO" )); // if else ? : 
			} else {
				System.out.println("Cilindrada: " + ((Moto)objVeiculo).getCilindrada());
			}
			
	}
}