package negocio;

import persistencia.CompraDAO;

public class Compra {
	
	//Propriedades
	
	private int id = 0;
	private Produto objProduto = null;
	private Cliente objCliente = null;
	private String data = "";
	private int quantidade = 0;

	//Construtores
	
	public Compra(int id, Produto objProduto, Cliente objCliente, String data, int quantidade) {
		super();
		this.id = id;
		this.objProduto = objProduto;
		this.objCliente = objCliente;
		this.data = data;
		this.quantidade = quantidade;
	}

	public Compra() {
		super();
	}


	//Acesso
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getObjProduto() {
		return objProduto;
	}

	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}

	public Cliente getObjCliente() {
		return objCliente;
	}

	public void setObjCliente(Cliente objCliente) {
		this.objCliente = objCliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//Metodos
	
	public String getDataParaBancoDeDados() { //formatação de data -> substring(pedaço da string / posição + 1(intervalo aberto)
		return getData().substring(6, 10) + "-" +
			   getData().substring(3, 5) + "-" +
			   getData().substring(0, 2);
	}
	
	public void persistir() throws Exception{
		new CompraDAO().persistir(this);
	}
}
