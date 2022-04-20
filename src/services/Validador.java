package services;

import java.util.HashMap;
import java.util.List;

import entities.RomanosInvertidos;
import exceptions.InvalidNumberException;

public class Validador {
	public static List<Integer> validar(List<Integer> numeros) {
		Integer ultimo = 0;
		Integer penultimo = 0;
		Integer antepenultimo = 0;
		for (Integer numero : numeros) {
			if (numero == ultimo) {
				if (ultimo == 5 || ultimo == 50 || ultimo == 500) {
					HashMap<Integer, String> tabela = RomanosInvertidos.getTabela();
					throw new InvalidNumberException("Número Romano com " + tabela.get(numero) + tabela.get(ultimo) + " não existe!");
				}
				if (ultimo == penultimo && penultimo == antepenultimo) {
					HashMap<Integer, String> tabela = RomanosInvertidos.getTabela();
					throw new InvalidNumberException("Número Romano com " + tabela.get(numero) + tabela.get(ultimo) + tabela.get(penultimo) + tabela.get(antepenultimo) + " não existe!");
				}
			}
			antepenultimo = penultimo;
			penultimo = ultimo;
			ultimo = numero;
		}
	return numeros;
	}
	
}