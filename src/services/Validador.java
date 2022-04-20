package services;

import java.util.List;

public class Validador {
	public static List<Integer> validar(List<Integer> numeros) {

		Integer ultimo = 0;
		Integer penultimo = 0;
		Integer antepenultimo = 0;
		for (Integer numero : numeros) {
			if (numero == ultimo) {
				if (ultimo == 5 || ultimo == 50 || ultimo == 500) {
					System.out.println("Número Inválido");
					break;
				}
				if (numero == ultimo && ultimo == penultimo && penultimo == antepenultimo) {
					System.out.println("Número Inválido");
					break;
				}
			}
			ultimo = numero;
		}
	return numeros;
	}
}