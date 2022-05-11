package ExemplosCondicionais;

import java.util.Scanner;

public class Ex {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome, apelido;
		System.out.println("Dados sobre o usúario.");
		System.out.printf("Digite sua idade: ");
		idade = leia.nextInt(); // lê variável do tipo inteira
		leia.nextLine(); // serve para limpar 
		System.out.printf("Digite seu nome: ");
		nome = leia.nextLine(); // lê variável do tipo String
		System.out.printf("Digite seu apelido: ");
		apelido = leia.nextLine();
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSeu apelido: %s",apelido);
		System.out.printf("\nSua idade: %d",idade);
		
		if (idade>=18) 
		{
			System.out.printf("\nVocê já é maior de idade.");
		}
			
			else if (idade>=1 && idade<18)// definindo se o usúario é maior ou = 1; se ele é menor que 18.
				//&&, todas as condições tem que ser verdadeiras, para ter uma saída verdadeira, senão serão falsas.
		    {
				System.out.printf("\nVocê é menor de idade.");
			}
			else 
			{
				System.out.printf("\nDado Incorreto@_@, tente outra vez!!!");
			}
			
		
	}


}
