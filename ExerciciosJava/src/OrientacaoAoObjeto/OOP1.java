package OrientacaoAoObjeto;

public class OOP1 {
	public static void main(String args[]) {
		
		Cliente pessoa = new Cliente("Mariana","leitura,","Senhor do Bonfim",26);				
		//está vindo do public cliente | // o 26 fica de fora das aspas por ser do tipo int
		
		pessoa.imprimirInfo();
		System.out.println("Esses foram os dados do cliente");		
	}

}
