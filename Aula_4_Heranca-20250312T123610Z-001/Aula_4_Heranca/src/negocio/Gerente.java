package negocio;

public class Gerente extends Colaborador{ //referencia Colaborador como upper
	
	//Propriedades
	
	private double bonus = 0; //ja tem as outras propriedades do Colaborador
	
	//Construtores
	
	public Gerente() {
		super();
	}

	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
	}

	//Acesso
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//Sobrescritos/Upper da Hierarquia
	
	public double getSalario() {
		return (super.getSalario() + this.getBonus());
	}
}