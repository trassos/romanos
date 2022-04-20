package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import services.Resolvedor;

public class Testes {

	@Test
	public void deveEntenderII() {
		List<Integer> numeros = new ArrayList<>();
		Integer soma = Resolvedor.resolver("II", numeros);
		System.out.println(soma);
		assertEquals(2,soma);
	}

	@Test
	public void deveEntenderIV() {
		List<Integer> numeros = new ArrayList<>();
		Integer soma = Resolvedor.resolver("IV", numeros);
		System.out.println(soma);
		assertEquals(4,soma);
	}

	@Test
	public void deveInvalidarVV() {
		List<Integer> numeros = new ArrayList<>();
		Integer soma = Resolvedor.resolver("VV", numeros);
		System.out.println(soma);
		assertEquals(10,soma);
	}

	@Test
	public void deveEntenderIIX() {
		List<Integer> numeros = new ArrayList<>();
		Integer soma = Resolvedor.resolver("IIX", numeros);
		System.out.println(soma);
		assertEquals(8,soma);
	}

	@Test
	public void deveEntenderXII() {
		List<Integer> numeros = new ArrayList<>();
		Integer soma = Resolvedor.resolver("XII", numeros);
		System.out.println(soma);
		assertEquals(12,soma);
	}
}
