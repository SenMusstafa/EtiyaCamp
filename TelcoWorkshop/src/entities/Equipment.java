package entities;

public class Equipment {
	private int id;
	private String brandName;
	private String equipmentName;
	private String serialNumber;
	private Service serviceId;

	
	public Equipment() {
		super();
	}


	public Equipment(int id, String brandName, String equipmentName, String serialNumber, Service serviceId) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.equipmentName = equipmentName;
		this.serialNumber = serialNumber;
		this.serviceId = serviceId;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEquipmentName() {
		return equipmentName;
	}


	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}


	public String getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public Service getServiceId() {
		return serviceId;
	}


	public void setServiceId(Service serviceId) {
		this.serviceId = serviceId;
	}
	
}