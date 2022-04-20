package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import services.Resolvedor;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String numeroRomano = sc.nextLine().toUpperCase(); 
		sc.close();
		
		List<Integer> numeros = new ArrayList<>();

		Integer soma = Resolvedor.resolver(numeroRomano, numeros);

		System.out.println(soma);
	}
}
