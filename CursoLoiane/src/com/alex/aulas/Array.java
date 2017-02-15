package com.alex.aulas;

public class Array {

	public static void main(String[] args) {
		
		
		double [] temperatura=new double[365];
		int cont = 0;
		
		for(int i=0;i<temperatura.length;i++){
			temperatura[i]=i;
			if(temperatura[i]%6==0){
				System.out.println("Temperatura do dia "+(i+1)+ " é "+temperatura[i]);
				cont++;
			}
					
		}
		System.out.println("Total de dias: "+cont);
	}

}
