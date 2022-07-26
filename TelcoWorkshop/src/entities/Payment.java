package entities;

import java.time.LocalDate;

public class Payment {
	private int id;
	private Canal canalId;
	private Invoice ivoiceId;
	private LocalDate paymentDate;
	
	
	public Payment() {
		super();
	}

	public Payment(int id, Canal canalId, Invoice ivoiceId, LocalDate paymentDate) {
		super();
		this.id = id;
		this.canalId = canalId;
		this.ivoiceId = ivoiceId;
		this.paymentDate = paymentDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Canal getCanalId() {
		return canalId;
	}


	public void setCanalId(Canal canalId) {
		this.canalId = canalId;
	}


	public Invoice getIvoiceId() {
		return ivoiceId;
	}


	public void setIvoiceId(Invoice ivoiceId) {
		this.ivoiceId = ivoiceId;
	}


	public LocalDate getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
}
