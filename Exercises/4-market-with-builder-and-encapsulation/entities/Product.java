package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product() {  //é bom mater o construtor padrão se quiser 		
	}                   //e chamar no Program
	
	public Product (String name, double price, int quantity) {
		this.name = name; //construtor para obrigar o objeto a receber dados
		this.price = price;  //no momento da instanciação
		this.quantity = quantity;
	}
	
	public Product (String name, double price) {
		this.name = name;
		this.price = price; //sobrecarga
		//nao precisa ter quantity = 0, por padrao o valor é zero
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public double getPrice() { //isso deve ser feito para que o Price seja acessado
		return price;  //pois esta PRIVATE, ENCAPSULAMENTO
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() { //a quantidade só poder alterada quando houver entrada ou saida
		return quantity; //no estoque, por isso não pode deixar ir no programa e colocar o valor que quiser							
	}     //entao nao tem SET, só faz o GET
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
