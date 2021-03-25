package br.com.agenda.escola.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.agenda.escola.classes.Usuarios;

public class LoginDao {
	
	private Connection conn;
	
	public void inserir(Usuarios usuarios) throws SQLException{
		try {
			conn = FabricaDeConexoes.criarConexao();
			String SQLInsert = "INSERT INTO Usuarios " + "(id_usuario, " + "nome, " + "usuario, "
					+ "senha " + ") " + "VALUES(?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(SQLInsert);
			ps.setInt(1,usuarios.getId_usuario());
			ps.setString(2,usuarios.getNome());
			ps.setString(3,usuarios.getUsuario());
			ps.setString(4,usuarios.getSenha());
			
			ps.execute();
			System.out.println("INCLUIDO COM SUCESSO!");
		} catch (Exception e) {
			System.out.println("OPA!!! ACONTECEU UM PROBLEMA:");
			e.printStackTrace();
		} finally {
			FabricaDeConexoes.fecharConexao(conn);
		}
	}
}