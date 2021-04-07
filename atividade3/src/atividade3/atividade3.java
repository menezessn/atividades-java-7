package atividade3;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner grava = new Scanner (System.in);
		
		int [] valor = new int[7];
		
		for(int i= 0 ; i<7 ; i++) {
			
			System.out.println("Digite o valor " + (i+1) + " : ");
			valor[i] = grava.nextInt();
			
			if (valor[i]%6==0) {
				System.out.println("Número múltiplo de 2 e 3!!!");
			}
			else if (valor[i]%2==0) {
				System.out.println("Número múltiplo de 2!!!");
			}
			else if (valor[i]%3==0) {
				System.out.println("Número múltiplo de 3!!!");
			}
			
			
		}

	}

}
