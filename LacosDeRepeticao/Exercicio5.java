package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.*/
	
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int n, soma=0;
		System.out.println("SOMANDO N�MEROS");
		System.out.println("Digite um n�mero, se quiser terminar digite 0: ");
		n = leia.nextInt();
		
		do
		{
			System.out.println("Digite um n�mero, se quiser terminar digite 0: ");
			soma = soma + n;
			n = leia.nextInt();
		}
		while (n!=0);
			System.out.println("A soma ser� de: "+soma);
		
		
	}

}
