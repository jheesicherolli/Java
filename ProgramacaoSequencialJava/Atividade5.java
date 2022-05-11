package ProgramacaoSequencialJava;

import java.util.Scanner;

public class Atividade5 {
	/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
	respectivamente.*/
	
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		float N1,N2,N3,media,res,peso1,peso2,peso3;
		System.out.println("Calculando a media");
		System.out.printf("\ninsira N1: ");
		N1 = leia.nextFloat();
		System.out.printf("\ninsira N2: ");
		N2 = leia.nextFloat();
		System.out.printf("\ninsira N3: ");
		N3 = leia.nextFloat();
		peso1=2;
		peso2=3;
		peso3=5;
		
		res= ((N1*peso1) + (N2 *peso2) + (N3*peso3)/3);
		System.out.printf("\nSua media final é: "+res);
		
	}

}
