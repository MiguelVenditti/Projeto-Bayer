package br.com.fiap.bayer.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bayer.BO.UnidadeSaude;

public class UnidadeSaudeDAO {
	
	public int add(UnidadeSaude unisau) {
		
		DAO dao = new DAO();
		
		try {
			PreparedStatement stmt = dao.getConnection().prepareStatement("INSERT INTO t_sip_unidade_saude VALUES (?, ?, ?, ?, ?)");
			
			stmt.setInt(1, unisau.getCd_unidade_saude());
			stmt.setString(2, unisau.getTipo_unidade());
			stmt.setString(3, unisau.getNm_unidade_saude());
			stmt.setInt(4, unisau.getNum_cep());
			stmt.setInt(5, unisau.getNum_endereco());
			return dao.executeCommand(stmt);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<UnidadeSaude>getAll() {
		DAO dao = new DAO();
		
		List<UnidadeSaude> lst = new ArrayList<UnidadeSaude>();
		PreparedStatement stmt;
		try {
			stmt = dao.getConnection().prepareStatement("select cd_unidade_saude, tipo_unidade, nm_unidade_saude, num_cep, num_endereco from t_sip_unidade_saude");
			ResultSet rs = null;
			rs = dao.getData(stmt);
				while (rs.next()) {
					UnidadeSaude c = new UnidadeSaude();
					c.setTipo_unidade(rs.getString("tipo_unidade"));
					c.setCd_unidade_saude(rs.getInt("cd_unidade_saude"));
					c.setNm_unidade_saude(rs.getString("nm_unidade_saude"));
					c.setNum_cep(rs.getInt("num_cep"));
					c.setNum_endereco(rs.getInt("num_endereco"));
					lst.add(c);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

}
