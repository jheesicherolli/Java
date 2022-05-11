package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99.*/

		public static void main(String args[]) {
			Scanner leia = new Scanner(System.in);
			int idade=0, cont=0, cont2=0;
			System.out.println("Para o programa terminar digite -99.");
			while(idade!= -99) {
				System.out.println("Escreva quantos anos tem: ");
				idade = leia.nextInt();
				if (idade <21 && idade >0) {
					cont++;
					if(idade>50){
						cont2++;					
					}
				}
				
			}
			System.out.println("Usúarios com menos de 21: "+cont);
			System.out.println("Usúarios com mais de 50: "+cont2);
		}

}
