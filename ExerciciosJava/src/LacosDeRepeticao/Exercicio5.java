package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.*/
	
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int n, soma=0;
		System.out.println("SOMANDO NÚMEROS");
		System.out.println("Digite um número, se quiser terminar digite 0: ");
		n = leia.nextInt();
		
		do
		{
			System.out.println("Digite um número, se quiser terminar digite 0: ");
			soma = soma + n;
			n = leia.nextInt();
		}
		while (n!=0);
			System.out.println("A soma será de: "+soma);
		
		
	}

}
