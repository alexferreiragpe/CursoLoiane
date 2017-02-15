package com.alex.aulas;

public class ArrayDeArray {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[5][4];

		notasAlunos[0][0] = 9.0;
		notasAlunos[0][1] = 6.0;
		notasAlunos[0][2] = 4.0;
		notasAlunos[0][3] = 175.0;

		notasAlunos[1][0] = 19.0;
		notasAlunos[1][1] = 6.0;
		notasAlunos[1][2] = 4.0;
		notasAlunos[1][3] = 789.0;

		notasAlunos[2][0] = 29.0;
		notasAlunos[2][1] = 6.0;
		notasAlunos[2][2] = 994.0;
		notasAlunos[2][3] = 999.0;

		notasAlunos[3][0] = 39.0;
		notasAlunos[3][1] = 6.0;
		notasAlunos[3][2] = 4.0;
		notasAlunos[3][3] = 278.0;

		notasAlunos[4][0] = 9.0;
		notasAlunos[4][1] = 86.0;
		notasAlunos[4][2] = 84.0;
		notasAlunos[4][3] = 78.0;

		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println();
			for (int j = 0; j < notasAlunos[j].length; j++) {

				System.out.println("Notas Posição: [" + i + "]" + " [" + j + "] = " + notasAlunos[i][j]);
			}
		}
		int a = 0;
		System.out.println();
		for (int i = 0; i < notasAlunos.length; i++) {
			double soma = 0;
			
			for (int j = 0; j < notasAlunos[j].length; j++) {

				soma += notasAlunos[i][j];

				
				if (notasAlunos[i][j] % 2 == 0) {
					System.out.println("É par " + notasAlunos[i][j]);
					a++;
				} else {
					System.out.println("É impar " + notasAlunos[i][j]);
				}

			}

			if ((soma / 4) < 50) {
				System.out.print("Média do Aluno: [" + (i + 1) + "] é: " + (soma / 4));
				System.out.println(" - Reprovado!");
			} else if ((soma / 4) >= 50 && (soma / 4) < 300) {
				System.out.print("Média do Aluno: [" + (i + 1) + "] é: " + (soma / 4));
				System.out.println(" - Aprovado!");
			} else if ((soma / 4) >= 300) {
				System.out.print("Média do Aluno: [" + (i + 1) + "] é: " + (soma / 4));
				System.out.println(" - Excelente!");
			}

		}
		System.out.println("Total de Pares: " + a);

	}

}
