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
				System.out.println("Digite qualquer número: ");
				num[i][j] = leia.nextInt();
				
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(num[i][j]>10) {
					contMai++;
					System.out.println("\nValores maiores que 10:"+contMai);
				}
				
				else {
					System.out.println("\nNão encontramos nenhum valor maior que 10!!");
					}
			}
		}
	
		
	}
}
