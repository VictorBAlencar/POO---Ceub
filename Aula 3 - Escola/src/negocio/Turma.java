package negocio;

public class Turma {
	//Propriedades
	
	private Cadeira objCadeira = null;
	private Professor objProfessor = null;
	private String letra = "";
	private Aluno[] colecao = new Aluno[50]; //colecao/vetor tem de dizer a quantidade maxima

	
	//Construtores
	
	public Turma(Cadeira objCadeira, Professor objProfessor, String letra, Aluno[] colecao) {
		this.objCadeira = objCadeira;
		this.objProfessor = objProfessor;
		this.letra = letra;
		this.colecao = colecao;
	}

	public Turma() {
	}

	//Acesso
	
	public Cadeira getObjCadeira() {
		return objCadeira;
	}


	public void setObjCadeira(Cadeira objCadeira) {
		this.objCadeira = objCadeira;
	}


	public Professor getObjProfessor() {
		return objProfessor;
	}


	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}


	public String getLetra() {
		return letra;
	}


	public void setLetra(String letra) {
		this.letra = letra;
	}


	public Aluno[] getColecao() {
		return colecao;
	}


	public void setColecao(Aluno[] colecao) {
		this.colecao = colecao;
	}
	
	//Complemento de Acesso Colecao
	
	int qtdAlunos = 0;
	
	public void adicionarAluno(Aluno objAluno) {
		colecao[qtdAlunos] = objAluno;
		qtdAlunos++;
	}
	
	public void listarAluno() {
		System.out.println("Matricula \t Nome");
		for(int i = 0; i < qtdAlunos; i++) {
			System.out.println(colecao[i].getMatricula() + " \t " + colecao[i].getNome());
		}
	}
}
