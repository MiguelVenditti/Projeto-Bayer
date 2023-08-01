package br.com.fiap.bayer.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bayer.BO.Doenca;

public class DoencaDAO {
	
	public int add(Doenca doe) {
		
		DAO dao = new DAO();
		
		try {
			PreparedStatement stmt = dao.getConnection().prepareStatement("INSERT INTO T_SIP_DOENCA VALUES (?,?,?)");
			
			stmt.setInt(1, doe.getCd_doenca());
			stmt.setString(2, doe.getNm_doenca());
			return dao.executeCommand(stmt);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Doenca>getAll() {
		DAO dao = new DAO();
		
		List<Doenca> lst = new ArrayList<Doenca>();
		PreparedStatement stmt;
		try {
			stmt = dao.getConnection().prepareStatement("SELECT * FROM T_SIP_DOENCA");
			ResultSet rs = null;
			rs = dao.getData(stmt);
				while (rs.next()) {
					Doenca c = new Doenca();
					c.setNm_doenca(rs.getString("nm_doenca"));
					c.setCd_doenca(rs.getInt("cd_doenca"));
					lst.add(c);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

}
