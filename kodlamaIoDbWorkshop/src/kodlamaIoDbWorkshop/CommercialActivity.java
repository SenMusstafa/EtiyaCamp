package kodlamaIoDbWorkshop;

import java.time.LocalDate;

public class CommercialActivity {
	private int id;
	private IndividualCustomer individualCustomer;
	private LocalDate startDate;
	
	public CommercialActivity() {
	}

	public CommercialActivity(int id, IndividualCustomer individualCustomer, LocalDate startDate) {
		super();
		this.id = id;
		this.individualCustomer = individualCustomer;
		this.startDate = startDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IndividualCustomer getIndividualCustomer() {
		return individualCustomer;
	}

	public void setIndividualCustomer(IndividualCustomer individualCustomer) {
		this.individualCustomer = individualCustomer;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
}
