package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import services.Contador;
import services.Conversor;
import services.Somador;
import services.Validador;

public class Testes {

	@Test
	public void deveEntenderII() {
		List<Integer> numeros = new ArrayList<>();
		numeros = Conversor.converter("II", numeros);
		numeros = Validador.validar(numeros);
		numeros = Contador.contar(numeros);
		Integer soma = Somador.somar(numeros);
		System.out.println(soma);
		assertEquals(2,soma);
	}

	String duasDiferentes = "IV";
	String duasInvalidas = "VV";
	String tresDiferentesMenos = "IIX";
	String tresDiferentesMais = "XII";

}
