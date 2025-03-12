package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Colaborador;
import negocio.Gerente;

public class VisaoRH {

	// Variaveis

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Colaborador objColaborador = null;
		String opcao = "";

		// Entrada

		try {
			System.out.print("Digite <C> para Colaborador ou <G> para Gerente:");
			opcao = leitor.readLine();

			if (opcao.equalsIgnoreCase("C")) {
				objColaborador = new Colaborador();
			} else {
				objColaborador = new Gerente(); // Polimorfismo
			}

			System.out.print("Digite a matricula: ");
			objColaborador.setMatricula(Integer.parseInt(leitor.readLine()));

			System.out.print("Digite o nome: ");
			objColaborador.setNome(leitor.readLine());

			System.out.print("Digite o salario: ");
			objColaborador.setSalario(Double.parseDouble(leitor.readLine()));

			if (!opcao.equalsIgnoreCase("C")) {
				System.out.print("Digite o bonus: ");
				((Gerente) objColaborador).setBonus(Double.parseDouble(leitor.readLine()));
			}
		} catch (Exception erro) {

			System.out.println("ERRO" + erro);
		}

		// Saida

		System.out.println("Matricula: " + objColaborador.getMatricula());
		System.out.println("Nome: " + objColaborador.getNome());
		System.out.println("Salario: " + objColaborador.getSalario());
	}
}