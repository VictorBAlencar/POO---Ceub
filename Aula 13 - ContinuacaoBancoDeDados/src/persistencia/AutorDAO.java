package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Autor;

public class AutorDAO {
	//DAO = Data Access Object
	
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null; //Cursor = Resultado
	
	//Acesso
	
	public Collection<Autor> getTodos() throws Exception{
		ArrayList<Autor> colecao = new ArrayList<Autor>();
	
	objBanco.conectar();
	
	objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM AUT_AUTOR"); //Prepara
	objCursor = objExecucao.executeQuery(); //Executa --> guarda no Cursor
	
	while(objCursor.next()) { // pula pra proxima ate acabar --> boolean
		colecao.add(new Autor(objCursor.getInt("AUT_ID"), //coluna do banco
							  objCursor.getString("AUT_NOME"))); //coluna do banco
	}
	
	objBanco.desconectar();
	
	return colecao;
	
	}
}
