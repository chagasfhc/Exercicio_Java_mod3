
package br.com.fuctura.model;

public class Jogador {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Jogador(String nome, int idade, double altura, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	public Jogador() {
		super();
	}
	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + "]";
	}

	
	

}
