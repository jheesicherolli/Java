package ProgramacaoSequencialJava;

import java.util.Scanner;

public class Exemplos // Introdu��o a Java
              {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int a,b,soma,subtracao,multiplicacao,divisao;
		System.out.println("Brincando com as opera��es matem�ticas!!!");
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextInt();
	    soma = a + b;
	    subtracao = a - b;
	    multiplicacao = a * b;
	    divisao = a/b;
	    System.out.println("A soma dos valores de A e B � de: "+soma);
	    System.out.println("A subtra��o dos valores de A e B � de: "+subtracao);
	    System.out.println("A multiplica��o dos valores de A e B � de: "+multiplicacao);
	    System.out.println("A divis�o dos valores de A e B � de: "+divisao);
	}

}
