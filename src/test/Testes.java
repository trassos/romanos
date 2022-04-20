package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import services.Resolvedor;

public class Testes {

	@Test
	public void deveEntenderII() {
		Integer soma = Resolvedor.resolver("II");
		System.out.println(soma);
		assertEquals(2,soma);
	}

	@Test
	public void deveEntenderIV() {
		Integer soma = Resolvedor.resolver("IV");
		System.out.println(soma);
		assertEquals(4,soma);
	}

	@Test
	public void deveInvalidarVV() {
		Integer soma = Resolvedor.resolver("VV");
		System.out.println(soma);
		assertEquals(10,soma);
	}

	@Test
	public void deveEntenderIIX() {
		Integer soma = Resolvedor.resolver("IIX");
		System.out.println(soma);
		assertEquals(8,soma);
	}

	@Test
	public void deveEntenderXII() {
		Integer soma = Resolvedor.resolver("XII");
		System.out.println(soma);
		assertEquals(12,soma);
	}
}
