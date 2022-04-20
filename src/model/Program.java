package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entities.Romanos;

public class Program {

	public static void main(String[] args) {

		String duasIguais = "II";
		String duasDiferentes = "IV";
		String duasInvalidas = "VV";
		String tresDiferentesMenos = "IIX";
		String tresDiferentesMais = "XII";

		// converte de letra para número
		int resultadoEsperado = 2;
		List<Integer> numeros = new ArrayList<>();

		HashMap<String, Integer> tabela = Romanos.getTabela();

//		System.out.println(resultadoEsperado);
		String[] letraSeparadas = tresDiferentesMais.split("(?<=\\G.{" + 1 + "})");
		for (int i = 0; i < letraSeparadas.length; i++) {
			System.out.println(tabela.isEmpty());
			System.out.println(tabela.get("I"));
			System.out.println("OI");
			numeros.add(tabela.get(letraSeparadas[i]));
		}

		// testa se número repetido é válido
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

		// define se valor positivo ou negativo
		Integer antevizinhoDireita = 0;
		Integer vizinhoDireita = 0;
		Integer atual = 0;
		for (int i = numeros.size() - 1; i >= 0; i--) {
			atual = numeros.get(i);
			if (atual == vizinhoDireita && atual < antevizinhoDireita) {
				System.out.println(i);
				numeros.set(i, atual * (-1));
				numeros.set(i + 1, atual * (-1));
			} else if (atual < vizinhoDireita) {
				numeros.set(i, atual * (-1));
			}

			antevizinhoDireita = vizinhoDireita;
			vizinhoDireita = atual;

		}
		System.out.println(numeros);

		// soma
		Integer soma = 0;
		for (Integer i : numeros) {
			soma += i;
		}
		// testa
		System.out.println(soma);
	}
}
