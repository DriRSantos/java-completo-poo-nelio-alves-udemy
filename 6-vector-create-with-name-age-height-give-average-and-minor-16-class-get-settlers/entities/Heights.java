package entities;

public class Heights {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Heights(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public Heights(String nome) {
		this.nome = nome;
	} 

	public Heights(int idade) {
		super();
		this.idade = idade;
	}

	public Heights(double altura) {
		this.altura = altura;
	}

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
}
