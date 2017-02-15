package com.alex.correcaoExercicioAula13;

import java.util.Scanner;

public class Exec3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Digite um Número: ");
		byte num=scan.nextByte();
		System.out.println("Digite outro Número: ");
		byte num1=scan.nextByte();
		
		System.out.println("A soma dos Números é: "+(num+num1));
		

	}

}
