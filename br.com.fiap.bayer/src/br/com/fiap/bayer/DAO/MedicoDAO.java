package br.com.fiap.bayer.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bayer.BO.Medico;

public class MedicoDAO {
	
	public int add(Medico med) {
		
		DAO dao = new DAO();
		
		try {
			PreparedStatement stmt = dao.getConnection().prepareStatement("INSERT INTO T_SIP_MEDICO VALUES (?,?,?)");
			
			stmt.setInt(1, med.getCd_medico());
			stmt.setString(2, med.getNm_medico());
			stmt.setString(3, med.getCrm_medico());
			return dao.executeCommand(stmt);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Medico>getAll() {
		DAO dao = new DAO();
		
		List<Medico> lst = new ArrayList<Medico>();
		PreparedStatement stmt;
		try {
			stmt = dao.getConnection().prepareStatement("SELECT * FROM T_SIP_MEDICO");
			ResultSet rs = null;
			rs = dao.getData(stmt);
				while (rs.next()) {
					Medico c = new Medico();
					c.setNm_medico(rs.getString("nm_medico"));
					c.setCd_medico(rs.getInt("cd_medico"));
					c.setCrm_medico(rs.getString("crm_medico"));
					lst.add(c);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

}
