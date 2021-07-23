package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato();
		Livros livros = new Livros();		
		
		System.out.println(gato);
		System.out.println(livros);
		/* String nome = "Patrik";
		System.out.println("Hello World " + nome + "!!");*/
	}

}

class Livros {
	private String nome;
	private String npag;
}