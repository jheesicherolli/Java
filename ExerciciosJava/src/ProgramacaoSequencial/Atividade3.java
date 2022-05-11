package ProgramacaoSequencial;

import java.util.Scanner;

public class Atividade3 {
	/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int segundos,res1,res2,resF;
		
	     System.out.println("\nDuração de um eventos em uma fábrica em segundos");
		 System.out.println("\nTempo em segundos: ");
		 segundos = leia.nextInt();
		 res1= segundos/3600;
		 System.out.println("\nTempo de duração em horas: "+res1);
	     res2= res1*60;
		 System.out.println("\nTempo de duração em minutos: "+res2);
		 resF = res2-res1;
		 System.out.println("\nO tempo de duração em segundos: "+resF);
		
	}

}
