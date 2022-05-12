package OrientacaoAoObjeto;

public class Cliente {
	/*Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	private String nomeCliente;
	private int idade;
	private String preferencias;
	private String cidade;
	
	public Cliente(String nomeCliente, String preferencias,String cidade, int idade)
	//método construtor = conseguir acessar

{
	this.nomeCliente = nomeCliente;
	this.preferencias = preferencias;
	this.cidade = cidade;
	this.idade = idade;
}
	public void imprimirInfo()
	{
		System.out.println("\nNome do cliente: "+nomeCliente+" mora na cidade de "+cidade+", tem preferência por "+preferencias+" sua idade é "+idade);
		//atributos da minha classe
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPreferencias() {
		return preferencias;
	}
	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	

}


