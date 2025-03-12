package negocio;

public class Colaborador { // referenciado ao object --> global
	
	//Propriedades
	
	private int matricula = 0;
	private String nome = "";
	private double salario = 0;

	
	//Construtores
	
	public Colaborador(int matricula, String nome, double salario) {
		super(); //referencia classe upper
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	public Colaborador() {
		super();
	}

	//Acesso
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
