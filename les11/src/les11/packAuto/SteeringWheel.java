package les11.packAuto;

public class SteeringWheel {
	private int diameter;
	private String material;
	
	public SteeringWheel() { }
	
	public SteeringWheel(int diameter, String material) {
		this.diameter = diameter;
		this.setMaterial(material);
	}
	
	public int getDiameter() {
		return diameter;
	}
	
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "SteeringWheel [diameter=" + diameter + ", material=" + material + "]";
	}
	
}
