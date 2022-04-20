package model;

import java.util.Scanner;

import services.Resolvedor;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String numeroRomano = sc.nextLine().toUpperCase(); 
		sc.close();

		Integer soma = Resolvedor.resolver(numeroRomano);

		System.out.println(soma);
	}
}
