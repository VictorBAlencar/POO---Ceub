package negocio;

public class DryMartini extends Bebida implements Mixer{
	public void misturar(){
		super.adicionar(new Ingredientes("Gyn", 100, "ml"));
		super.adicionar(new Ingredientes("Vodka", 50, "ml"));
		super.adicionar(new Ingredientes("Vermuth", 10, "ml"));
		super.adicionar(new Ingredientes("Gelo", 10, "unidades"));
		super.adicionar(new Ingredientes("Azeitona", 3, "unidades"));
	}
}
