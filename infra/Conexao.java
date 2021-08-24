package infra;

import java.sql.*;

public class Conexao {

	// atributos
	private static Connection conexao = null;
	
	private String fonte = "tictactoe";
	//Conexao para a Base de Dados do MySQL utilizando JDBC
	private Conexao()  {
		
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + fonte, "root", "1234");
		
		} 
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ocorreu um erro na conexao com o banco de dados!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getInstance()  {
		if (conexao == null) {
		    new Conexao();
		}
		return conexao;
	}
}