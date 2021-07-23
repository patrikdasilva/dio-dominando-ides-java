package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("A soma de " + a + "+" + b + " é " + soma);
		System.out.println("A subtracao de " + a + "-" + b + " é " + subtracao);
		System.out.println("A multiplicacao de " + a + "x" + b + " é " + multiplicacao);
		System.out.println("A divisao de " + a + "/" + b + " é " + divisao);
		
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static double divisao(int a, int b) {
		return a / b;
	}
}
