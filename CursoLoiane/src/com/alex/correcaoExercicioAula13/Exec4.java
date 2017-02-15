package com.alex.correcaoExercicioAula13;

import java.util.Scanner;

import com.alex.aulas.Array;

public class Exec4 {

	public static void main(String[] args) {

		double[] media = new double[4];
		Scanner scan = new Scanner(System.in);
		double total = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a " + (i + 1) + " Nota");

			media[i] = scan.nextDouble();
			total += media[i];

		}

		double med = total / 4;

		System.out.println("A média das 4 notas é: " + med);

	}

}
