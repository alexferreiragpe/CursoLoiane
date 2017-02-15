package com.alex.correcaoExercicioAula13;

import java.util.Scanner;

public class Exec6 {

	public static void main(String[] args) {
		System.out.print("Digite o Raio do Circulo: ");
		
		Scanner scan = new Scanner(System.in);
		double area = scan.nextDouble();
		double pi=3.141595;
		double total=pi*(area*area);
		System.out.print("\n¡rea do Circulo È: "+String.format("%.2f",  total)+" cm");
		

	}

}
