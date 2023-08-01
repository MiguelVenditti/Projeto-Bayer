package br.com.fiap.bayer.BO;

public class Medico {
	private int cd_medico;
	private String nm_medico;
	private String crm_medico;
	
	
	public int getCd_medico() {
		return cd_medico;
	}
	public void setCd_medico(int cd_medico) {
		this.cd_medico = cd_medico;
	}
	public String getNm_medico() {
		return nm_medico;
	}
	public void setNm_medico(String nm_medico) {
		this.nm_medico = nm_medico;
	}
	public String getCrm_medico() {
		return crm_medico;
	}
	public void setCrm_medico(String crm_medico) {
		this.crm_medico = crm_medico;
	}
	

	@Override
	public String toString() {
		return "Medico [cd_medico=" + cd_medico + ", nm_medico=" + nm_medico + ", crm_medico=" + crm_medico + "]";
	}


	
}
