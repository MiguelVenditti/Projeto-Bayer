package br.com.fiap.bayer.BO;

public class Endereco {

	private int cd_endereco;
	private String cd_regiao;
	private String cd_uf;
	private String cd_municipio;
	
	public int getCd_endereco() {
		return cd_endereco;
	}
	public void setCd_endereco(int cd_endereco) {
		this.cd_endereco = cd_endereco;
	}
	public String getCd_regiao() {
		return cd_regiao;
	}
	public void setCd_regiao(String cd_regiao) {
		this.cd_regiao = cd_regiao;
	}
	public String getCd_uf() {
		return cd_uf;
	}
	public void setCd_uf(String cd_uf) {
		this.cd_uf = cd_uf;
	}
	public String getCd_municipio() {
		return cd_municipio;
	}
	public void setCd_municipio(String cd_municipio) {
		this.cd_municipio = cd_municipio;
	}
	
	@Override
	public String toString() {
		return "Endereco [cd_endereco=" + cd_endereco + ", cd_regiao=" + cd_regiao + ", cd_uf=" + cd_uf
				+ ", cd_municipio=" + cd_municipio + "]";
	}
	
	
	
}
