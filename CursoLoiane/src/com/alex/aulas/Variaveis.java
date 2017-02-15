package com.alex.aulas;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		
		int oct31=031;
		int dec25=025;
		
		System.out.println(oct31==dec25);
		
		
		Scanner scan=new Scanner(System.in);
		String nome=scan.nextLine();
		System.out.println(nome);
		
		String a="teste";
		String b="asdfa";
		String c=a+b;
		scan.close();
		System.out.println(c);
	}

}
