package les11.packAuto;

public class Auto {
	
	private int horsePower;
	private int yearOfProduction;
	private Engine e;
	private SteeringWheel s;
	
	public Auto() { }
	
	public Auto(int horsePower, int yearOfProduction, Engine e, SteeringWheel s) {
		this.setHorsePower(horsePower);
		this.setYearOfProduction(yearOfProduction);
		this.e = e;
		this.s = s;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	
	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public SteeringWheel getS() {
		return s;
	}

	public void setS(SteeringWheel s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Auto [horsePower=" + horsePower + ", yearOfProduction=" + yearOfProduction + ", engine=" + e + ", steering wheel=" + s
				+ "]";
	}
	
	
	
}
