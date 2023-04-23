package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	
	private LocalDateTime star;
	private LocalDateTime finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {		
	}

	public CarRental(LocalDateTime star, LocalDateTime finish, Vehicle vehicle) {
		this.star = star;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStar() {
		return star;
	}

	public void setStar(LocalDateTime star) {
		this.star = star;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}	
}
