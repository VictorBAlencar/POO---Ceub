package negocio;

public class MoskowMule extends Bebida implements Mixer{
	public void misturar() {
		super.adicionar(new Ingredientes("Cachaca", 100, "ml"));
		super.adicionar(new Ingredientes("Limao", 3, "unidades"));
		super.adicionar(new Ingredientes("Acucar", 5, "g"));
		super.adicionar(new Ingredientes("Gelo", 8, "unidades"));
		super.adicionar(new Ingredientes("Gengibre", 20, "g"));
		super.adicionar(new Ingredientes("Espuma de gengibre", 50, "ml"));
	}
}
