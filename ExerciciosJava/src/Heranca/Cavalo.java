package Heranca;



public class Cavalo extends Animal {
	
	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public static void main(String[] args) {
		Cavalo p2 = new Cavalo();
		p2.getClass();
		p2.setNome("Blanco.");
		p2.setIdade("21.");
		p2.setEmite("Iihhh.");
		p2.setCorrer("trotando...");
		
		System.out.println("O nome do cavalo �: "+p2.getNome());
		System.out.println("A idade do Blanco �: "+p2.getIdade());
		System.out.println("O som que ele faz �: "+p2.getEmite());
		System.out.println("Ele est�: "+p2.getCorrer());
		
		
		
	}


}
