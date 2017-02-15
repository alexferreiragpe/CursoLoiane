package com.alex.aulas;

public class MatrizTridimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] matriz = new int[3][3][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				for (int k = 0; k < matriz[j].length; k++) {
					System.out.println(i + " - " + j + " - " + k);
				}

			}
		}
		System.out.println();
		int cont = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				for (int k = 0; k < matriz.length; k++) {
					// if(i==j&&j==k)System.out.println(i+" "+j+" "+k);
					System.out.println("Soma linha/coluna/altura: " + i + " " + j + " " + k + " : " + (i + j + k));
					cont++;
				}

			}
		}
		
	}

}
