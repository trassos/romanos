package services;

import java.util.List;

public class Contador {
	public static List<Integer> contar(List<Integer> numeros) {

		Integer antevizinhoDireita = 0;
		Integer vizinhoDireita = 0;
		Integer atual = 0;
		for (int i = numeros.size() - 1; i >= 0; i--) {
			atual = numeros.get(i);
			if (atual == vizinhoDireita && atual < antevizinhoDireita) {
				numeros.set(i, atual * (-1));
				numeros.set(i + 1, atual * (-1));
			} else if (atual < vizinhoDireita) {
				numeros.set(i, atual * (-1));
			}

			antevizinhoDireita = vizinhoDireita;
			vizinhoDireita = atual;

		}

	return numeros;
	}
}