package br.com.josino.MatrizBrf.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Classificacao {

	Leve("1"),
	Moderada("2"),
	Alta("3"),
	Critica("4");

	public String nivel;
	public String descricao;
	
	Classificacao(String nivel) {
		this.nivel = nivel;
	}
	
	public String getNivel() {
		return nivel;
	}
	
	
	public static Map<String, List<Map<String, String>>> listaClassificacaoErgospeed() {
		Map<String, List<Map<String, String>>> classificacaoMap = new HashMap<>();
				
		classificacaoMap.put("1", adicionaValorColuna(Classificacao.Leve.getNivel(),Classificacao.Leve.getNivel(), Classificacao.Moderada.getNivel(),Classificacao.Moderada.getNivel()));
		classificacaoMap.put("2", adicionaValorColuna(Classificacao.Leve.getNivel(),Classificacao.Moderada.getNivel(), Classificacao.Moderada.getNivel(),Classificacao.Moderada.getNivel()));
		classificacaoMap.put("3", adicionaValorColuna(Classificacao.Moderada.getNivel(),Classificacao.Moderada.getNivel(), Classificacao.Moderada.getNivel(),Classificacao.Alta.getNivel()));
		classificacaoMap.put("4", adicionaValorColuna(Classificacao.Moderada.getNivel(),Classificacao.Alta.getNivel(), Classificacao.Alta.getNivel(),Classificacao.Alta.getNivel()));
		
		return classificacaoMap;
		
	}
	
	public static List<Map<String, String>> adicionaValorColuna(String valorColuna1, String valorColuna2, String valorColuna3, String valorColuna4) {
		List<Map<String, String>> classificacoesLinhaList = new ArrayList<>();
		classificacoesLinhaList.add(Collections.singletonMap("classificacao", valorColuna1));
		classificacoesLinhaList.add(Collections.singletonMap("classificacao", valorColuna2));
		classificacoesLinhaList.add(Collections.singletonMap("classificacao", valorColuna3));
		classificacoesLinhaList.add(Collections.singletonMap("classificacao", valorColuna4));
		return classificacoesLinhaList;
	}
	
	
}
