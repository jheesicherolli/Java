package LacoDeDecisao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[]) {
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual 
		  categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto*/

		int idade;
		Scanner read = new Scanner(System.in);
		System.out.println("Qual a sua idade? ");
		idade = read.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Você está na categoria infantil.");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Você está na categoria juvenil.");
		}
		else if(idade>=18 && idade <=25) {
			System.out.println("Você já se tornou adulto!!!");
		}
		else {
			System.out.println("Tente outra vez!!!");
		}
	}

}
