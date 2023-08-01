package br.com.fiap.bayer.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bayer.BO.Diagnostico;

public class DiagnosticoDAO {
	
	public int add(Diagnostico dia) {
		
		DAO dao = new DAO();
		
		try {
			PreparedStatement stmt = dao.getConnection().prepareStatement("INSERT INTO T_SIP_DIAGNOSTICO VALUES (?,?,?)");
			
			stmt.setInt(1, dia.getNum_diagnostico());
			stmt.setDate(2, dia.getDt_diagnostico());
			stmt.setString(3, dia.getDesc_resultado());
			stmt.setBoolean(4,dia.isStatus());
			return dao.executeCommand(stmt);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Diagnostico>getAll() {
		DAO dao = new DAO();
		
		List<Diagnostico> lst = new ArrayList<Diagnostico>();
		PreparedStatement stmt;
		try {
			stmt = dao.getConnection().prepareStatement("SELECT * FROM T_SIP_DIAGNOSTICO");
			ResultSet rs = null;
			rs = dao.getData(stmt);
				while (rs.next()) {
					Diagnostico c = new Diagnostico();
					c.setDesc_resultado(rs.getString("Desc_resultado"));
					c.setNum_diagnostico(rs.getInt("Num_diagnostico"));
					c.setDesc_resultado(rs.getString("desc_resultado"));
					c.setStatus(rs.getBoolean("Status"));
					lst.add(c);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}

}
