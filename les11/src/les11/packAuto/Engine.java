package les11.packAuto;

public class Engine {
	private int numberOfCylinders;

	public Engine(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public Engine() { }

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [numberOfCylinders=" + numberOfCylinders + "]";
	}
	
}
