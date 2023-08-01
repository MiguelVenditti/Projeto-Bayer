package br.com.fiap.bayer.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bayer.BO.Endereco;

public class EnderecoDAO {
	
	public int add(Endereco end) {
		
		DAO dao = new DAO();
		
		try {
			PreparedStatement stmt = dao.getConnection().prepareStatement("INSERT INTO T_SIP_ENDERECO (?,?,?)");
			
			stmt.setInt(1, end.getCd_endereco());
			stmt.setString(2, end.getCd_regiao());
			stmt.setString(3, end.getCd_uf());
			stmt.setString(4, end.getCd_municipio());
			return dao.executeCommand(stmt);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Endereco>getAll() {
		DAO dao = new DAO();
		
		List<Endereco> lst = new ArrayList<Endereco>();
		PreparedStatement stmt;
		try {
			stmt = dao.getConnection().prepareStatement("SELECT * FROM T_SIP_ENDERECO");
			ResultSet rs = null;
			rs = dao.getData(stmt);
				while (rs.next()) {
					Endereco c = new Endereco();
					c.setCd_municipio(rs.getString("cd_municipio"));
					c.setCd_endereco(rs.getInt("cd_endereco"));
					c.setCd_uf(rs.getString("cd_uf"));
					c.setCd_regiao(rs.getString("cd_regiao"));
					lst.add(c);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

}
