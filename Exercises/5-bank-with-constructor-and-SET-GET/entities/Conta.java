package entities;

public class Conta {

	private int number;
	private String holder;
	private double balance;
	
	public Conta(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Conta(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); //se a regra de deposito mudar no futuro
	}							//mexe apenas a operacao de deposito, sem alterar o construtor						

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}

	
	public void deposit(double amount) {
		balance += amount; 
	}

	public void withdraw(double amount) {
		balance -= amount + 5.00; //vai reduzir o valor do saldo + a taxa de 5
	}
		
	public String toString() {  //obrigatorio para conseguir imprimir as informações
		return "Account " 
		     + number
		     + ", Holder: " 
			 + holder
		     + ", Balance: $" 
		     + String.format("%.2f", balance);
    }
} 
