package com.alex.aulas;

import java.util.Scanner;

public class LoopIfeElse {

	public static void main(String[] args) {
		int dia;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dia da Semana ");
		System.out.println("Digite um Valor entre 1 e 7: ");
		dia = scan.nextInt();

		while (dia < 1 || dia > 7) {
			System.out.println("Valor Inválido!");
			System.out.println("Digite um Valor entre 1 e 7: ");
			dia = scan.nextInt();
		}

		if (dia == 1) {
			System.out.println("Domingo");
		} else if (dia == 2) {
			System.out.println("Segunda-Feira");
		} else if (dia == 3) {
			System.out.println("Terça-Feira");
		} else if (dia == 4) {
			System.out.println("Quarta-Feira");
		} else if (dia == 5) {
			System.out.println("Quinta-Feira");
		} else if (dia == 6) {
			System.out.println("Sexta-Feira");
		} else if (dia == 7) {
			System.out.println("Sábado");
		}

		System.out.println("Deseja Verificar outro Dia? ");
		String resp = scan.next();
		while (resp.equals("s")) {
			System.out.println("Digite um Valor entre 1 e 7: ");
			dia = scan.nextInt();
			while (dia < 1 || dia > 7) {
				System.out.println("Valor Inválido!");
				System.out.println("Digite um Valor entre 1 e 7: ");
				dia = scan.nextInt();
			}
			if (dia == 1) {
				System.out.println("Domingo");
			} else if (dia == 2) {
				System.out.println("Segunda-Feira");
			} else if (dia == 3) {
				System.out.println("Terça-Feira");
			} else if (dia == 4) {
				System.out.println("Quarta-Feira");
			} else if (dia == 5) {
				System.out.println("Quinta-Feira");
			} else if (dia == 6) {
				System.out.println("Sexta-Feira");
			} else if (dia == 7) {
				System.out.println("Sábado");
			}
			
			System.out.println("\nDeseja Verificar outro Dia? ");
			resp = scan.next();
		}
scan.close();
		System.out.println("Verificador Finalizado! ");
	}

}
