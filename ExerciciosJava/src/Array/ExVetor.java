package Array;

import java.util.Scanner;

public class ExVetor {
	//tipo vetor
		public static void main(String args[]){
			
			float[] media = new float[4];
			float n1,n2,n3,somaMedia=0,mg;
			int x;
			
			Scanner leia = new Scanner(System.in);
			
			for(x=0;x<4;x++) {
				System.out.println("Entre com a primeira nota:");
				n1 = leia.nextFloat();
				System.out.println("Entre com a segunda nota: ");
				n2 = leia.nextFloat();
				System.out.println("Entre com a terceira nota: ");
				n3 = leia.nextFloat();
				
				media[x]=(n1+n2+n3)/3;
				System.out.printf("\nMédia: %.2f",media[x]);
				somaMedia+=media[x];
			}
			mg = somaMedia / 4;
			System.out.printf("Média Geral: %.2f",mg);
		}

}
