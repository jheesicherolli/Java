package Heranca;

public class Cachorro extends Animal{
	

		
		private String deve;

		public String getDeve() {
			return deve;
		}

		public void setDeve(String deve) {
			this.deve = deve;
		}
		
		public static void main(String[] args) {
			Cachorro p1 = new Cachorro();
			p1.getClass();
			p1.setNome("Ger�nimo.");
			p1.setIdade("5.");
			p1.setEmite("AUAU.");
			p1.setDeve("Correr.");
			
			System.out.println("O nome do cachorro �: "+p1.getNome());
			System.out.println("A idade do Ge�nimo �: "+p1.getIdade());
			System.out.println("O som que ele faz �: "+p1.getEmite());
			System.out.println("Esse animal pode: "+p1.getDeve());

			
			
			
		}
		
	}
	


