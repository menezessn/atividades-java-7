package atividade1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner grava = new Scanner(System.in);
		
		double[]valor = new double[10];
		int negativo = 0;
		double soma=0;
		
		for(int i = 0; i<10 ; i++) {
			
			System.out.println("Digite o valor " + (i+1) + " : ");
			valor[i] = grava.nextDouble();
			if(valor[i] < 0) {
				
				negativo++;
				System.out.println("Número negativo!");
				
			} else {
				
				soma+= valor[i];
				System.out.println("Número positivo!");
			}
			
			
		}
		
		System.out.println("A quantidade de números negativos inseridos foi " + negativo );
		System.out.println("A soma dos números negativos é " + soma);
		
		

	}

}
