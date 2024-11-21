package br.com.josino.MatrizBrf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.josino.MatrizBrf.enums.Classificacao;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ){
    	Map<String, List<Map<String, String>>> classificacaoMap = Classificacao.listaClassificacaoErgospeed();
    	System.out.println(classificacaoMap);
    	
    	
    }
}
