package br.com.fotosensor.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	private static final String USUARIO="root";
	private static final String SENHA="admin";
	private static final String URL = "jdbc:mysql://localhost:3306/fotosensor";
	
	public static Connection conectar() throws SQLException {
		
		Connection conexao = DriverManager.getConnection(URL,USUARIO,SENHA);
		return conexao;		
	}
	
	public static void main(String[] args) {
		try {
			Connection conexao = ConexaoBD.conectar();
			System.out.println("Banco de dados conectado com sucesso!");
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			System.out.println("Conexão com o Banco de dados falhou !");
		}
        }
}
	