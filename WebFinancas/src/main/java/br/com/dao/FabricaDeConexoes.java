package br.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {

	private static final String USUARIO_DB = "root";
	private static final String SENHA_DB = "";
	private static final String URL_DB = "jdbc:mysql://localhost:3306/teste_sefaz";
	
	public static Connection criaConexao() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(URL_DB, USUARIO_DB, SENHA_DB);
		
		System.out.println("Conectou com Sucesso!");
		
		return conn;
	}
	
	public static void fecharConexao(Connection conn){
		try {
			conn.close();
			System.out.println("Fechado com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			criaConexao();
			System.out.println("Conectou com Sucesso!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error!");
			e.printStackTrace();			
		}
	}
	
}
