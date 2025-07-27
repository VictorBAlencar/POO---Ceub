package persistencia;

import java.sql.PreparedStatement;

import negocio.Pessoa;

public class PessoaDAO {

	//Toda classe de negocio tem de ter um na persistencia para conectar -> DAO(Data Access Object)
	
	//Propriedades
	
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	
	//Metodos
	
	public void persistir(Pessoa objPessoa) throws Exception{
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement(
				"INSERT INTO PES_PESSOA" +
				"(PES_NOME, PES_ENDERECO, PES_TELEFONE)" +
				"VALUES" +
				"(?, ?, ?)");
		
		// + serve para quando pular linha, n precisa
		
		objExecucao.setString(1, objPessoa.getNome());
		objExecucao.setString(2, objPessoa.getEndereco());
		objExecucao.setString(3, objPessoa.getTelefone());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
