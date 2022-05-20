package LacoDeDecisao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[])
	
	/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
	{
		int x,y,z, maiorN;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o primeiro número: ");
		x = leia.nextInt();
		System.out.println("Entre com o segundo número: ");
		y = leia.nextInt();
		System.out.println("Entre com o terceiro número: ");
		z = leia.nextInt();
		
	 if (x>y && x>z) {
		 maiorN = x;
		 System.out.println("O maior número dentre os é o: "+maiorN); 
	 }
	 else if(y>x && y>z){
		 maiorN = y;
		 System.out.println("O maior número dentre os é o: "+maiorN);
		 
	 }
	 else if(z>x && z>y){
		 maiorN = z;
		 System.out.println("O maior número dentre os é o: "+maiorN);
	 }
	 else {
		 System.out.println("Você digitou algum dado incorreto!!");
	 }
	}

}
