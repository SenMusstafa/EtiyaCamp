package entities;

public class Cable extends Equipment {
	private String cableType;
	private double cableLenght;
	
	
	
	public Cable() {
		super();
	}


	public Cable(int id, String brandName,String equipmentName, String serialNumber, Service serviceId,String cableType, double cableLenght) {
		super(id, brandName,equipmentName, serialNumber, serviceId);
		this.cableType = cableType;
		this.cableLenght = cableLenght;
	}


	public String getCableType() {
		return cableType;
	}


	public void setCableType(String cableType) {
		this.cableType = cableType;
	}


	public double getCableLenght() {
		return cableLenght;
	}


	public void setCableLenght(double cableLenght) {
		this.cableLenght = cableLenght;
	}
	
	
}
