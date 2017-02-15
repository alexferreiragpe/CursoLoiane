package com.alex.aulas;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("************************************************");
		System.out.println(" Entrevista:");
		System.out.println();
		System.out.println("************************************************");

		System.out.println("Quantidade de Pessoas Entrevistadas?");
		int qtdPessoas = scan.nextInt();
		while (qtdPessoas < 1) {
			System.out.println("Quantidade de Pessoa Inválida! Necessário no Mínimo 1 Pessoa, Tente Novamente:");
			qtdPessoas = scan.nextInt();
		}

		String[][] entrevistados = new String[qtdPessoas][];
		int cont = 0;
		int contFilho = 0;
		for (int i = 0; i < qtdPessoas; i++) {
			System.out.println("Quantidade de Filhos Entrevistado " + (i + 1) + ":");
			int qtdFilhos = scan.nextInt();
			entrevistados[i] = new String[qtdFilhos];
			cont++;
			for (int j = 0; j < qtdFilhos; j++) {
				System.out.println("Nome do " + (j + 1) + "º Filho:");
				entrevistados[i][j] = scan.next();
				contFilho++;
			}
			System.out.println("************************************************");

		}
		System.out.println();
		System.out.println("************************************************");
		System.out.println("Resultado:");
		System.out.println();
		System.out.println("************************************************");

		for (int i = 0; i < entrevistados.length; i++) {
			System.out.println();
			System.out.println("************************************************");
			System.out.println("Nome dos Filhos do " + (i + 1) + "º Entrevistado.");
			System.out.println();
			for (int j = 0; j < entrevistados[i].length; j++) {
				System.out.println("Nome do " + (j + 1) + "º Filho: " + entrevistados[i][j]);
			}

		}

		System.out.println();
		System.out.println("************************************************");
		System.out.println("Total de Entrevistados: " + cont);
		System.out.println("Total de Filhos: " + contFilho);
		scan.close();
	}

}
