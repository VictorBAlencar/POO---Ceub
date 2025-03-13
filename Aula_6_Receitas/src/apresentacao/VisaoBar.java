package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Bebida;
import negocio.Caipirinha;
import negocio.DryMartini;
import negocio.MoskowMule;
import negocio.OldFashion;

public class VisaoBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis
		
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(System.in));
		Bebida objBebida = null;
		int opcao = 0;
		
		//Entrada
		
		try {
			System.out.println("Cardapio:");
			System.out.println("1.Caipirinha");
			System.out.println("2.Dry Martini");
			System.out.println("3.Old Fashion");
			System.out.println("4.Moskow Mule");
			System.out.println("Digite a opcao desejada: ");
			opcao = Integer.parseInt(leitor.readLine());
			
		switch(opcao) {
			case 1:
				objBebida = new Caipirinha();
				break;
				
			case 2:
				objBebida = new DryMartini();
				break;
			
			case 3:
				objBebida = new OldFashion();
				break;
				
			case 4:
				objBebida = new MoskowMule();
				break;
			}
			((negocio.Mixer)objBebida).misturar();
			
			//Saida
			
			objBebida.beber();
		} catch(Exception error) {
			System.out.print(error);
		}
	}
}