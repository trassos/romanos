package services;

import java.util.List;

public class Resolvedor {
	public static Integer resolver(String numeroRomano, List<Integer> numeros) {
		numeros = Conversor.converter(numeroRomano, numeros);
		numeros = Validador.validar(numeros);
		numeros = Contador.contar(numeros);
		Integer soma = Somador.somar(numeros);
	return soma;
	}
}