package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aguia;
import negocio.Animal;
import negocio.Aves;
import negocio.Cachorro;
import negocio.Leopardo;
import negocio.Mamifero;

public class VisaoZoologico {
	// Variaveis

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(System.in));
		Animal objAnimal = null;
		String opcao = "";

		// Entrada

		try {
			do {
			System.out.print("Digite <C> para Cachorro / <L> para Leopardo / <A> para Aguia: ");
				opcao = leitor.readLine();
			if(opcao.equalsIgnoreCase("C")) {
				objAnimal = new Cachorro();
			} else if(opcao.equalsIgnoreCase("L")){
				objAnimal = new Leopardo();
			} else if(opcao.equalsIgnoreCase("A")){
				objAnimal = new Aguia();
			} else {
				System.out.println("Errado. Tente Novamente.");
			}
		} while(!opcao.equalsIgnoreCase("C") && !opcao.equalsIgnoreCase("L") && !opcao.equalsIgnoreCase("A"));
			
			System.out.print("Digite o nome: ");
				objAnimal.setNome(leitor.readLine());
			System.out.print("Digite o peso: ");
				objAnimal.setPeso(Double.parseDouble(leitor.readLine()));
			System.out.print("Digite a altura: ");
				objAnimal.setAltura(Double.parseDouble(leitor.readLine()));
				
			if(opcao.equalsIgnoreCase("C")) {
				System.out.print("Digite a quantidade de litros de leite: ");
					((Mamifero)objAnimal).setLitrosLeite(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite a forca da mordida: ");
					((Cachorro)objAnimal).setForcaMordida(Double.parseDouble(leitor.readLine()));
	
			} else if (opcao.equalsIgnoreCase("L")) {
				System.out.print("Digite a quantidade de litros de leite: ");
				((Mamifero)objAnimal).setLitrosLeite(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite a velocidade: ");
				((Leopardo)objAnimal).setVelocidade(Double.parseDouble(leitor.readLine()));
			} else {
				System.out.print("Digite a quantidade de ovos: ");
					((Aves)objAnimal).setQuantidadeOvos(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite a autonomia: ");
					((Aguia)objAnimal).setAutonomia(Double.parseDouble(leitor.readLine()));
			}
		} catch (Exception erro) {
			System.out.println("Erro");
		}
		
		// Saida
		
		System.out.println("Digite o nome: " + objAnimal.getNome());
		System.out.println("IMC: " + objAnimal.calcularIMC());
		if(opcao.equalsIgnoreCase("C")) {
			((Cachorro)objAnimal).morder();
		} else if(opcao.equalsIgnoreCase("L")) {
			((Leopardo)objAnimal).correr();
		} else {
			((Aguia)objAnimal).voar();
		}
	}
}