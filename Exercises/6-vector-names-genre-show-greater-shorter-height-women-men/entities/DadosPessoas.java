package entities;

public class DadosPessoas {
	
	private char genre;
	private double height;

	public DadosPessoas(double height, char genre) {
		this.height = height;
		this.genre = genre;
	}

	public char getGenre() {
		return genre;
	}

	public double getHeight() {
		return height;
	}
		
}
