package LacoDeDecisao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[])
	
	/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
	{
		int x,y,z, maiorN;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o primeiro n�mero: ");
		x = leia.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		y = leia.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		z = leia.nextInt();
		
	 if (x>y && x>z) {
		 maiorN = x;
		 System.out.println("O maior n�mero dentre os � o: "+maiorN); 
	 }
	 else if(y>x && y>z){
		 maiorN = y;
		 System.out.println("O maior n�mero dentre os � o: "+maiorN);
		 
	 }
	 else if(z>x && z>y){
		 maiorN = z;
		 System.out.println("O maior n�mero dentre os � o: "+maiorN);
	 }
	 else {
		 System.out.println("Voc� digitou algum dado incorreto!!");
	 }
	}

}
