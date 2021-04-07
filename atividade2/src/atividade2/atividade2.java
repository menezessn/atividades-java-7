package atividade2;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
		Scanner grava = new Scanner (System.in);
		int [] valor = new int[5];
		int positivo = 0;
		
		for (int i = 0; i <5 ; i++) {
			
			System.out.println("Digite o valor " + (i+1) + " : ");
			valor[i] = grava.nextInt();
			
			if (valor[i]>0) {
				
				System.out.println(valor[i] + " é número positivo!");
				
				
			}
			
		}

	}

}
