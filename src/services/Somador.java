package services;

import java.util.List;

public class Somador {
	public static Integer somar(List<Integer> numeros) {

		Integer soma = 0;
		for (Integer i : numeros) {
			soma += i;
		}

	return soma;
	}
}