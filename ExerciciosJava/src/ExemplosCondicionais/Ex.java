package ExemplosCondicionais;

import java.util.Scanner;

public class Ex {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome, apelido;
		System.out.println("Dados sobre o us�ario.");
		System.out.printf("Digite sua idade: ");
		idade = leia.nextInt(); // l� vari�vel do tipo inteira
		leia.nextLine(); // serve para limpar 
		System.out.printf("Digite seu nome: ");
		nome = leia.nextLine(); // l� vari�vel do tipo String
		System.out.printf("Digite seu apelido: ");
		apelido = leia.nextLine();
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSeu apelido: %s",apelido);
		System.out.printf("\nSua idade: %d",idade);
		
		if (idade>=18) 
		{
			System.out.printf("\nVoc� j� � maior de idade.");
		}
			
			else if (idade>=1 && idade<18)// definindo se o us�ario � maior ou = 1; se ele � menor que 18.
				//&&, todas as condi��es tem que ser verdadeiras, para ter uma sa�da verdadeira, sen�o ser�o falsas.
		    {
				System.out.printf("\nVoc� � menor de idade.");
			}
			else 
			{
				System.out.printf("\nDado Incorreto@_@, tente outra vez!!!");
			}
			
		
	}


}
