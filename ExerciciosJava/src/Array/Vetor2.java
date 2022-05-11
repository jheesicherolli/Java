package Array;

import java.util.Scanner;

public class Vetor2 {
	/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/
	public static void main(String args[]) {
		
		int [] num = new int[6];
		int quantImpar=0,quantPar=0,i;
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<6;i++) {
			
			System.out.println("Digite até 6 números inteiros de sua prefência: ");
			 num[i] = leia.nextInt();
		
			if(i%2==0) 
			{
				quantPar++;		
		   }
			else {
				quantImpar++;
			}
			System.out.println("\n"+quantPar+" números pares.");
			System.out.println("\n"+quantImpar+" números ímpares");
	}

	}

}
