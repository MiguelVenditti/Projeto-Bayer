package br.com.fiap.bayer.DAO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class DAO {

	private Connection conn;
	 
	public DAO () {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	// Disponibiliza a conexao aberta para outras classes
	public Connection getConnection() {
		openConnection();
		return this.conn;
	}
	
	// Abre conexï¿½o com oracle atravï¿½s do driver
	private void openConnection() {
		try {
			if (this.conn == null) {
				this.conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92066", "091190");
			}
			System.out.println("Conexão com o banco feita com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	// Fecha a conexao
	private void closeConnection() {
		try {
			if (this.conn != null) {
				this.conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Responsavel por executar commandos (Insert, Delete, Update) e mostrar linhas afetadas
	public int executeCommand(PreparedStatement stmt) {
		int j = 0;
		
		try {
			j = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return j;
	}
	
	// Responsavel pela busca de dados na base (Select)
	public ResultSet getData(PreparedStatement stmt) {
		ResultSet rs = null;
		
		try {
			rs = stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}


