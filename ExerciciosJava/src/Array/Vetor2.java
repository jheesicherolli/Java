package Array;

import java.util.Scanner;

public class Vetor2 {
	/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/
	public static void main(String args[]) {
		
		int [] num = new int[6];
		int quantImpar=0,quantPar=0,i;
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<6;i++) {
			
			System.out.println("Digite at� 6 n�meros inteiros de sua pref�ncia: ");
			 num[i] = leia.nextInt();
		
			if(i%2==0) 
			{
				quantPar++;		
		   }
			else {
				quantImpar++;
			}
			System.out.println("\n"+quantPar+" n�meros pares.");
			System.out.println("\n"+quantImpar+" n�meros �mpares");
	}

	}

}
