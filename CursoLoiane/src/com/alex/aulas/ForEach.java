package com.alex.aulas;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[5];

		// for normal
		for (int i = 0; i < notas.length; i++) {
			notas[i] = i;

			Random random = new Random();
			notas[i] = random.nextInt(10);
			
			System.out.println(("Nota " + (i + 1) + " Valor: " + notas[i]));
		}

		System.out.println("For Each");
		for (int nota : notas) {
			System.out.println("Notas: " + nota);
		}

	}

	// for each
	/*
	 * for(int nota:notas){ System.out.println("Notas "+nota); }
	 */

}
