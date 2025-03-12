package negocio;

public class Compra {

	//Propriedades
	
	private Produto objProduto = null;
	private int quantidade = 0;
	private String data = "";
	private String cartao = "";
	
	//Metodos Construtores
	
	public Compra(Produto objProduto, int quantidade, String data, String cartao) {
		this.objProduto = objProduto;
		this.quantidade = quantidade;
		this.data = data;
		this.cartao = cartao;
	}
	
	//Metodos de Acesso
	
	public Compra() {
	}
	public Produto getObjProduto() {
		return objProduto;
	}
	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
}
