package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	//Propriedades
	
	private Connection objConexao = null;
	
	//Métodos
	
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/Aula_12_Banco_De_Dados?" +
												 "user=root&password=ceub123456&" +
												 "serverTimezone=UTC-3&useSS=false");
	}
	
	void desconectar() throws Exception {
		objConexao.close();
	}
	
	Connection getObjConexao() {
		return objConexao;
	}
}
