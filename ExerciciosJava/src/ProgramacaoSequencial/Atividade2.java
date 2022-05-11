package ProgramacaoSequencial;

import java.util.Scanner;

public class Atividade2 {
	/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	expressa em anos, meses e dias.*/
	public static void main(String args[]) {
		
		int dias, meses,res, res2;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInforme sua idade em dias: ");
        dias = leia.nextInt();
        res = dias/365;
	    System.out.println("\nSua idade em anos é: "+res);
		meses = res*12;
		System.out.println("\nSua idade em meses é: "+meses);
		System.out.println("\nSua idade em dias é: "+dias);
	}

}
