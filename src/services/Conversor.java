package services;

import java.util.HashMap;
import java.util.List;

import entities.Romanos;

public class Conversor {
	public static List<Integer> converter(String numeroRomano, List<Integer> numeros) {
		String[] letraSeparadas = numeroRomano.split("(?<=\\G.{" + 1 + "})");
		HashMap<String, Integer> tabela = Romanos.getTabela();
		for (int i = 0; i < letraSeparadas.length; i++) {
			numeros.add(tabela.get(letraSeparadas[i]));
		}
		return numeros;
	}
}
