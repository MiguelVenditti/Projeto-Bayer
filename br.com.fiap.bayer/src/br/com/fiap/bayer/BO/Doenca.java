package br.com.fiap.bayer.BO;

public class Doenca {
	
	private int cd_doenca;
	private String nm_doenca;
	public int getCd_doenca() {
		return cd_doenca;
	}
	public void setCd_doenca(int cd_doenca) {
		this.cd_doenca = cd_doenca;
	}
	public String getNm_doenca() {
		return nm_doenca;
	}
	public void setNm_doenca(String nm_doenca) {
		this.nm_doenca = nm_doenca;
	}
	
	@Override
	public String toString() {
		return "Doencas [cd_doenca=" + cd_doenca + ", nm_doenca=" + nm_doenca + "]";
	}
	
	

}
