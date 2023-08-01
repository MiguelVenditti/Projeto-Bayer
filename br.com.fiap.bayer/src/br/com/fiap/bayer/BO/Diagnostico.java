package br.com.fiap.bayer.BO;

import java.sql.Date;

public class Diagnostico {
	
	private int num_diagnostico;
	private Date dt_diagnostico;
	private String desc_resultado;
	private boolean status;
	public int getNum_diagnostico() {
		return num_diagnostico;
	}
	public void setNum_diagnostico(int num_diagnostico) {
		this.num_diagnostico = num_diagnostico;
	}
	public Date getDt_diagnostico() {
		return dt_diagnostico;
	}
	public void setDt_diagnostico(Date dt_diagnostico) {
		this.dt_diagnostico = dt_diagnostico;
	}
	public String getDesc_resultado() {
		return desc_resultado;
	}
	public void setDesc_resultado(String desc_resultado) {
		this.desc_resultado = desc_resultado;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Diagnostico [num_diagnostico=" + num_diagnostico + ", dt_diagnostico=" + dt_diagnostico
				+ ", desc_resultado=" + desc_resultado + ", status=" + status + "]";
	}

	
	
}
