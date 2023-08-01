package br.com.fiap.bayer.BO;

public class UnidadeSaude {
	private int cd_unidade_saude;
	private String tipo_unidade;
	private String nm_unidade_saude;
	private int num_cep;
	private int num_endereco;
	
	
	public int getCd_unidade_saude() {
		return cd_unidade_saude;
	}
	public void setCd_unidade_saude(int cd_unidade_saude) {
		this.cd_unidade_saude = cd_unidade_saude;
	}
	public String getTipo_unidade() {
		return tipo_unidade;
	}
	public void setTipo_unidade(String tipo_unidade) {
		this.tipo_unidade = tipo_unidade;
	}
	public String getNm_unidade_saude() {
		return nm_unidade_saude;
	}
	public void setNm_unidade_saude(String nm_unidade_saude) {
		this.nm_unidade_saude = nm_unidade_saude;
	}
	public int getNum_cep() {
		return num_cep;
	}
	public void setNum_cep(int num_cep) {
		this.num_cep = num_cep;
	}
	public int getNum_endereco() {
		return num_endereco;
	}
	public void setNum_endereco(int num_endereco) {
		this.num_endereco = num_endereco;
	}
	
	
	@Override
	public String toString() {
		return "UnidadeSaude [cd_unidade_saude=" + cd_unidade_saude + ", tipo_unidade=" + tipo_unidade
				+ ", nm_unidade_saude=" + nm_unidade_saude + ", num_cep=" + num_cep + ", num_endereco=" + num_endereco
				+ "]";
	}
	
	
	
	
}
