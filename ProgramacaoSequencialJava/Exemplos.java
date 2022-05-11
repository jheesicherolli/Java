package ProgramacaoSequencialJava;

import java.util.Scanner;

public class Exemplos // Introdução a Java
              {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int a,b,soma,subtracao,multiplicacao,divisao;
		System.out.println("Brincando com as operações matemáticas!!!");
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextInt();
	    soma = a + b;
	    subtracao = a - b;
	    multiplicacao = a * b;
	    divisao = a/b;
	    System.out.println("A soma dos valores de A e B é de: "+soma);
	    System.out.println("A subtração dos valores de A e B é de: "+subtracao);
	    System.out.println("A multiplicação dos valores de A e B é de: "+multiplicacao);
	    System.out.println("A divisão dos valores de A e B é de: "+divisao);
	}

}
