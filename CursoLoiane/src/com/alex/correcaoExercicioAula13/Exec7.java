package com.alex.correcaoExercicioAula13;

import java.util.Scanner;

public class Exec7 {

	public static void main(String[] args) {
		System.out.print("Digite o Valor do Lado do Quadrado: ");
		
		Scanner scan = new Scanner(System.in);
		double lado = scan.nextDouble();
		double total=(lado*lado);
		System.out.print("\n¡rea do Quadrado È: "+String.format("%.2f",  total)+" cm");
		


	}

}
