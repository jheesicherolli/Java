package OrientacaoAoObjeto;
 // exerc�cios feitos em sala
public class Auto {
public static void main(String[] args) {
		
		//instanciando um objeto da classe Autom�vel
		Automovel auto1 = new Automovel("Luciana Rocha","Mazda","LD2019",2023);
		
		auto1.imprimirInfo();
		System.out.println("\n*************Transfer�ncia de Proprietarie*************");
		auto1.setNomeProprietario("Tacio Ferreira");
		auto1.imprimirInfo();

	}

}
