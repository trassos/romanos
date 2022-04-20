package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import services.Contador;
import services.Conversor;
import services.Resolvedor;
import services.Somador;
import services.Validador;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String numeroRomano = sc.nextLine().toUpperCase(); 

		List<Integer> numeros = new ArrayList<>();

		Integer soma = Resolvedor.resolver(numeroRomano, numeros);
		
		// Imprime
		System.out.println(soma);
	}
}
