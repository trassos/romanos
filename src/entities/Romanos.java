package entities;

import java.util.HashMap;

public class Romanos {
	public static final HashMap<String, Integer> getTabela() {
		HashMap<String, Integer> tabela = new HashMap<String, Integer>();
		tabela.put("I", 1);
		tabela.put("V", 5);
		tabela.put("X", 10);
		tabela.put("L", 50);
		tabela.put("C", 100);
		tabela.put("D", 500);
		tabela.put("M", 1000);
		return tabela;
	}
	
}