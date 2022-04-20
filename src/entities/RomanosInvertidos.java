package entities;

import java.util.HashMap;

public class RomanosInvertidos {
	public static final HashMap<Integer, String> getTabela() {
		HashMap<Integer, String> tabela = new HashMap<Integer, String>();
		tabela.put(1, "I");
		tabela.put(5, "V");
		tabela.put(10, "X");
		tabela.put(50, "L");
		tabela.put(100, "C");
		tabela.put(500, "D");
		tabela.put(1000, "M");
		return tabela;
	}
	
}