package br.com.fiap.bayer.BO;

import java.sql.Date;

public class Paciente {
	
	private int cd_paciente;
	private int cd_rg;
	private int cd_cartao_sus;
	private String nm_paciente;
	private String ds_sexo;
	private Date dt_nasc;
	public int getCd_paciente() {
		return cd_paciente;
	}
	public void setCd_paciente(int cd_paciente) {
		this.cd_paciente = cd_paciente;
	}
	public int getCd_rg() {
		return cd_rg;
	}
	public void setCd_rg(int cd_rg) {
		this.cd_rg = cd_rg;
	}
	public int getCd_cartao_sus() {
		return cd_cartao_sus;
	}
	public void setCd_cartao_sus(int cd_cartao_sus) {
		this.cd_cartao_sus = cd_cartao_sus;
	}
	public String getNm_paciente() {
		return nm_paciente;
	}
	public void setNm_paciente(String nm_paciente) {
		this.nm_paciente = nm_paciente;
	}
	public String getDs_sexo() {
		return ds_sexo;
	}
	public void setDs_sexo(String ds_sexo) {
		this.ds_sexo = ds_sexo;
	}
	public Date getDt_nasc() {
		return dt_nasc;
	}
	public void setDt_nasc(Date dt_nasc) {
		this.dt_nasc = dt_nasc;
	}
	
	@Override
	public String toString() {
		return "Paciente [cd_paciente=" + cd_paciente + ", cd_rg=" + cd_rg + ", cd_cartao_sus=" + cd_cartao_sus
				+ ", nm_paciente=" + nm_paciente + ", ds_sexo=" + ds_sexo + ", dt_nasc=" + dt_nasc + "]";
	}
	
	

}
