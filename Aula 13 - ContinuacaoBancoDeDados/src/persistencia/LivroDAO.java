package persistencia;

import java.sql.PreparedStatement;

import negocio.Livro;

public class LivroDAO {
	
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	
	//Acesso
	
	public void persistir(Livro objLivro) throws Exception{
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement(
					  "INSERT INTO LIV_LIVRO" +
					  "(LIV_TITULO, LIV_IDAUTOR)" +
					  "VALUES" +
					  "(?, ?)");
		
		objExecucao.setString(1, objLivro.getTitulo());;
		objExecucao.setInt(2, objLivro.getObjAutor().getIdAutor());
				
		objExecucao.executeUpdate();		
		
		objBanco.desconectar();
	}
}
