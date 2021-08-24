package infra;
import java.sql.Connection;
import java.sql.PreparedStatement;

import Models.DadosTicTacToe;

public class ClientTicTacToeDAO {

	static Connection conexao = null;

	public static void InsertDados(DadosTicTacToe Dados) throws Exception {
		conexao = Conexao.getInstance();
		
		String sql = "INSERT INTO DadosTicTacToe(dados, chave) VALUES (?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, Dados.Vencedor);
		stmt.setString(2, Dados.Chave);
		
		stmt.execute();
		stmt.close();

		
	}
}
