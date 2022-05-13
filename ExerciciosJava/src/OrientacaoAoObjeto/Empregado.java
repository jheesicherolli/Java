package OrientacaoAoObjeto;
//exercises done in class

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	public Empregado(String n, double s)
	{
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda()
	//método sem void necessita de retorno
	{
		   NumberFormat nf = NumberFormat.getCurrencyInstance();
		   //vai pegar a moeda do país e armazenar
		   nf.setMinimumFractionDigits(2);
		   // limita o número de digitos depois da vírgula
		   String formatarMoeda = nf.format(salario);
		   //formata o salário
		   return formatarMoeda();
		   //vai retornar com todas as informções da moeda
	   }
	
	public void imprimir()
	{
		   System.out.println("\n"+nome+"\t\tSalário: "+this.formatarMoeda());
		   /* aqui é um método chamando outro método da própria classe,é o
		     método imprimir chamando o formatar.*/
	   }
	
}
