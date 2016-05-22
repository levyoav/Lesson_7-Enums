package enumExamples.cars;

public class Car {

	//Enum definition within the class.
	public enum Color {
		BLACK, WHITE, RED, GREEN, BLUE;
	}

	//Attributes
	private int speed;
	private Color color;
	private Manufacturer manuf;

	public Car(int speed, Color color, Manufacturer manuf) {
		super();
		this.speed = speed;
		this.color = color;
		this.manuf = manuf;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Manufacturer getMake() {
		return manuf;
	}

	public void setMake(Manufacturer manuf) {
		this.manuf = manuf;
	}

	//The toString() of enums return their represented value.
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + ", make=" + manuf
				+ "]";
	}

}
