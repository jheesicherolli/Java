package Array;

import java.util.Scanner;

public class Matriz3 {

	/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
	public static void main(String args[]) {
		
		int i=3, j=3;
		int [][] num = new int[i][j];//i = linha, j = coluna
		int contMai=0;
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				System.out.println("Insira números de sua preferência: ");
				num[i][j] = leia.nextInt();
		
				if(num[i][j]>10) {
					contMai++;
			
				 }
				
	           }
             }                 
			System.out.println("\n"+contMai+" números maiores que 10.");
	
	}	
}

