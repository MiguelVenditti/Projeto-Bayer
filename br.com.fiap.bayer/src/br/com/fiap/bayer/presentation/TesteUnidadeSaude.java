package br.com.fiap.bayer.presentation;

import br.com.fiap.bayer.BO.UnidadeSaude;
import br.com.fiap.bayer.DAO.UnidadeSaudeDAO;

public class TesteUnidadeSaude {
	
	public static void main(String[] args) {
		UnidadeSaude unisau = new UnidadeSaude();
		UnidadeSaudeDAO cDao = new UnidadeSaudeDAO();
		
		unisau.setCd_unidade_saude(1);
		unisau.setTipo_unidade("UBS");
		unisau.setNm_unidade_saude("Jacana");
		unisau.setNum_cep(02137010);
		unisau.setNum_endereco(978);
		System.out.println("Unidade cadastrada " + cDao.add(unisau));
		
		unisau.setCd_unidade_saude(2);
		unisau.setTipo_unidade("AMA");
		unisau.setNm_unidade_saude("Vila Guilherme");
		unisau.setNum_cep(12345678);
		unisau.setNum_endereco(128);
		System.out.println("Unidade cadastrada " + cDao.add(unisau));
		
		unisau.setCd_unidade_saude(3);
		unisau.setTipo_unidade("UBS");
		unisau.setNm_unidade_saude("Vila Sabrina");
		unisau.setNum_cep(87654321);
		unisau.setNum_endereco(98);
		System.out.println("Unidade cadastrada " + cDao.add(unisau));
		
		unisau.setCd_unidade_saude(4);
		unisau.setTipo_unidade("Pronto Socorro");
		unisau.setNm_unidade_saude("Vila Maria");
		unisau.setNum_cep(42138671);
		unisau.setNum_endereco(782);
		System.out.println("Unidade cadastrada " + cDao.add(unisau));
		
		unisau.setCd_unidade_saude(5);
		unisau.setTipo_unidade("UBS");
		unisau.setNm_unidade_saude("Consolacao");
		unisau.setNum_cep(01234542);
		unisau.setNum_endereco(412);
		System.out.println("Unidade cadastrada " + cDao.add(unisau));
				
		for (UnidadeSaude c : cDao.getAll()) {
			System.out.println(c);
		}
	}

}
