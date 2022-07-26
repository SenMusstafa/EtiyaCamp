package entities;

import java.time.LocalDate;
import java.util.List;

public class SubscriptionDetail extends Subscription {
	private LocalDate subscriptionCreatedDate;
	private LocalDate subcriptionDueDate;
	
	public SubscriptionDetail() {
		super();
	}

	public SubscriptionDetail(int id, Customer customer, Service service, List<Invoice> invoices,LocalDate subscriptionCreatedDate, LocalDate subcriptionDueDate) {
		super(id, customer, service, invoices);
		this.subscriptionCreatedDate = subscriptionCreatedDate;
		this.subcriptionDueDate = subcriptionDueDate;
	}

	public LocalDate getSubscriptionCreatedDate() {
		return subscriptionCreatedDate;
	}

	public void setSubscriptionCreatedDate(LocalDate subscriptionCreatedDate) {
		this.subscriptionCreatedDate = subscriptionCreatedDate;
	}

	public LocalDate getSubcriptionDueDate() {
		return subcriptionDueDate;
	}

	public void setSubcriptionDueDate(LocalDate subcriptionDueDate) {
		this.subcriptionDueDate = subcriptionDueDate;
	}
	
}
