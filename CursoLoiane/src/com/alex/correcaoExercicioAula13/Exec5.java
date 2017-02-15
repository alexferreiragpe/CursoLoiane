package com.alex.correcaoExercicioAula13;

import java.util.Scanner;

public class Exec5 {

	public static void main(String[] args) {
		System.out.println("Digite o Valor em Metros: ");
		Scanner scan = new Scanner(System.in);
		double total = scan.nextDouble();
		
		System.out.println("O valor em Centímetros é: "+(total*100)+" Cm");

	}

}
