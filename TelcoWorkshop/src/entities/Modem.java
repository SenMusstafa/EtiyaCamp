package entities;

public class Modem extends Equipment {
	private String portNum;
	private String modemType;
	
	
	public Modem() {
		super();
	}


	public Modem(int id, String brandName,String equipmentName, String serialNumber, Service serviceId, String portNum, String modemType) {
		super(id, brandName,equipmentName, serialNumber, serviceId);
		this.portNum = portNum;
		this.modemType = modemType;
	}


	public String getPortNum() {
		return portNum;
	}


	public void setPortNum(String portNum) {
		this.portNum = portNum;
	}


	public String getModemType() {
		return modemType;
	}


	public void setModemType(String modemType) {
		this.modemType = modemType;
	}
	

}