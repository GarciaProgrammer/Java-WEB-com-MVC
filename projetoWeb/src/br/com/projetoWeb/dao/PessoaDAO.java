package br.com.projetoWeb.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.projetoWeb.beans.Pessoa;
import br.com.projetoWeb.cnn.ConnectionFactory;

public class PessoaDAO {

	public ArrayList<Pessoa> listaPessoas() {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "Select * from pessoa where id = 1";
		ArrayList<Pessoa> arPessoas = new ArrayList();

		try {
			PreparedStatement stm = cnn.prepareStatement(query);
			ResultSet res = stm.executeQuery(query);

			while (res.next()) {
				Pessoa pes = new Pessoa(res.getLong("id"), res.getString("nome"), res.getString("dt_nascimento"),
						res.getString("sexo").charAt(1));
				arPessoas.add(pes);
			}
			cnn.close();
			res.close();
			return arPessoas;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
