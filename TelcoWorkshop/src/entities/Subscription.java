package entities;

import java.util.List;



public class Subscription {

	private int id;	
	private Customer customerId;
	private Service serviceId;
	private List<Invoice> invoices;
	
	public Subscription() {
		super();
	}
	public Subscription(int id, Customer customer, Service service, List<Invoice> invoices) {
		super();
		this.id = id;
		this.customerId = customer;
		this.serviceId = service;
		this.invoices = invoices;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	public Service getServiceId() {
		return serviceId;
	}
	public void setServiceId(Service serviceId) {
		this.serviceId = serviceId;
	}
	public List<Invoice> getInvoices() {
		return invoices;
	}
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	
	
}
