package br.edu.senai.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton
public class ConnectionFactorySingleton {
	private static String urlConexao = "jdbc:postgresql://localhost:5432/aula_jdbc";
	private static String usuario = "postgres";
	private static String senha = "deadpool360";
	private static Connection connection = null;

	private static Connection newConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(urlConexao, usuario, senha);
		} catch (SQLException e) {
			System.out.println("Não foi possivel abrir a conexão!");
		}
		return con;
	}

	public static Connection getConnection() {
		if (connection == null) {
			connection = newConnection();
			System.out.println("Conectado com sucesso!");
		}
		return connection;
	}
}
