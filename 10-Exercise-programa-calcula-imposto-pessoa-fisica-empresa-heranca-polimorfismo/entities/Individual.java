package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
			
	public Individual() {
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxes() {
		double taxesPaid = 0;
		if (getAnualIncome() < 20000.00) {
			taxesPaid = getAnualIncome() * 0.15;
		}
		else if (getAnualIncome() > 20000.00) {
			taxesPaid = getAnualIncome() * 0.25;
		}
		taxesPaid -= getHealthExpenditures() * 0.5;
		if (taxesPaid < 0.0) {
			taxesPaid = 0.0;
		}
			return taxesPaid;
	}
	
}
