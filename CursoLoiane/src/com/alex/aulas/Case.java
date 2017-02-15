package com.alex.aulas;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o dia da Semana: ");

		int dia = scan.nextInt();
		while (dia < 1 || dia > 7) {
			System.out.println("Dia da Semana Inválido, digite novamente: ");
			dia = scan.nextInt();
			scan.close();
		}
		switch (dia) {

		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia útil");
			break;
		case 7:
		case 1:
			System.out.println("Final de semana");
			break;
		default:
			System.out.println("Dia inválido!");

		}

	}

}
