package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aluno;
import negocio.Cadeira;
import negocio.Professor;
import negocio.Turma;

public class VisaoEscola {
	public static void main(String[] args) {
		// Variaveis

		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Turma objTurma = new Turma();
		Professor objProfessor = new Professor();

		try {
			// Professor

			System.out.print("Digite o nome da cadeira: ");
			objTurma.setObjCadeira(new Cadeira(leitor.readLine()));

			System.out.print("Digite o nome do professor: ");
			objProfessor.setNome(leitor.readLine());

			System.out.print("Digite a titulacao do professor: ");
			objProfessor.setTitulo(leitor.readLine());

			System.out.print("Digite o salario do professor: ");
			objProfessor.setSalario(Double.parseDouble(leitor.readLine()));

			// Aluno

			do {
				Aluno objAluno = new Aluno(); // cria um novo aluno e associa ao objAluno

				System.out.print("Digite a matricula do aluno: ");
				objAluno.setMatricula(Integer.parseInt(leitor.readLine()));

				System.out.print("Digite o nome do aluno: ");
				objAluno.setNome(leitor.readLine());

				objTurma.adicionarAluno(objAluno); // associa/adiciona/matricula o objAluno à Turma(objTurma)

				System.out.print("Digite <S> se houver mais alunos: ");

			} while (leitor.readLine().equalsIgnoreCase("S"));
				objTurma.setObjProfessor(objProfessor);

		} catch (Exception erro) {
			System.out.println("ERRO" + erro);
		}
		// Saida de Dados

		System.out.println("Cadeira " + objTurma.getObjCadeira().getNome());
		System.out.println("Professor: " + objTurma.getObjProfessor().getTitulo() + "" + objTurma.getObjProfessor().getNome());
		System.out.println("Alunos: ");
		objTurma.listarAluno();
	}
}