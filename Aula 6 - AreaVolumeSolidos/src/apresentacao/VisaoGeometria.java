package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Cilindro;
import negocio.Cubo;
import negocio.Solido;

public class VisaoGeometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis
		
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(System.in));
		Solido objSolido = null;
		int opcao = 0;
	
		try {
			do{
			System.out.print("Digite <1> para Cubo ou <2> para Cilindro: ");

			opcao = Integer.parseInt(leitor.readLine());
			
			if(opcao == 1) {
				objSolido = new Cubo();
				
				System.out.print("Digite o valor da aresta: ");
				((Cubo)objSolido).setAresta(Double.parseDouble(leitor.readLine())); //Cubo <--ObjSolido
			} else if(opcao == 2){
				objSolido = new Cilindro();
				
				System.out.print("Digite o valor do raio: ");
				((Cilindro)objSolido).setRaio(Double.parseDouble(leitor.readLine()));
				
				System.out.print("Digite o valor da altura: ");
				((Cilindro)objSolido).setAltura(Double.parseDouble(leitor.readLine()));
			}
			else {
				System.out.println("Tente novamente.");
				}
			} while(opcao != 1 && opcao != 2);
		} catch(Exception erro) {
			System.out.print(erro);
		}
		
		//Saida
		
		System.out.println("Area: " + objSolido.CalcularArea());
		System.out.println("Volume: " + objSolido.CalcularVolume());
	}	
}
