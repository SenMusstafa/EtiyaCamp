package entities;

public class PackageSubcription {
	private int id;
	private Package packageId;
	private Subscription subcriptionId;
	
	public PackageSubcription() {
		super();
	}

	public PackageSubcription(int id, Package packageId, Subscription subcriptionId) {
		super();
		this.id = id;
		this.packageId = packageId;
		this.subcriptionId = subcriptionId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Package getPackageId() {
		return packageId;
	}

	public void setPackageId(Package packageId) {
		this.packageId = packageId;
	}

	public Subscription getSubcriptionId() {
		return subcriptionId;
	}

	public void setSubcriptionId(Subscription subcriptionId) {
		this.subcriptionId = subcriptionId;
	}
	
	
}
