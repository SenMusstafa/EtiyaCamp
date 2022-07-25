package kodlamaIoDbWorkshop;

import java.time.LocalDate;

public class Statement {
	private int id;
	private Customer customer;
	private LocalDate date;
	private double sum;
	
	public Statement() {
	
	}
	public Statement(int id, Customer customer, LocalDate date, double sum) {
		super();
		this.id = id;
		this.customer = customer;
		this.date = date;
		this.sum = sum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	
}
