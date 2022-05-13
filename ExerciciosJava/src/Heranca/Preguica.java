package Heranca;

public class Preguica extends Animal {
	
	private String escalar;

	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) 
	{
		this.escalar = escalar;
	}

	public static void main(String[] args) {
		Preguica p3 = new Preguica();
		p3.setNome("Francisquin.");
		p3.setIdade("29.");
		p3.setEmite("ZZZZZ.");
		p3.setEscalar("árvores.");
		
		System.out.println("O nome da preguiça é: "+p3.getNome());
		System.out.println("A idade do Francisquin é: "+p3.getIdade());
		System.out.println("O som que ele faz é: "+p3.getEmite());
		System.out.println("O Francisquin gosta de escalar: "+p3.getEscalar());
	}

