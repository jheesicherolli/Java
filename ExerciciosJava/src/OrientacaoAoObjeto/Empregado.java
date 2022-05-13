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
	//m�todo sem void necessita de retorno
	{
		   NumberFormat nf = NumberFormat.getCurrencyInstance();
		   //vai pegar a moeda do pa�s e armazenar
		   nf.setMinimumFractionDigits(2);
		   // limita o n�mero de digitos depois da v�rgula
		   String formatarMoeda = nf.format(salario);
		   //formata o sal�rio
		   return formatarMoeda();
		   //vai retornar com todas as inform��es da moeda
	   }
	
	public void imprimir()
	{
		   System.out.println("\n"+nome+"\t\tSal�rio: "+this.formatarMoeda());
		   /* aqui � um m�todo chamando outro m�todo da pr�pria classe,� o
		     m�todo imprimir chamando o formatar.*/
	   }
	
}
