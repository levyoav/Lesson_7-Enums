package enumExamples.planets;

//Enums may hold additional data and methods.
public enum Planet {
	//For each Planet value, two int attributes are associated. The attribute are with respect
	//to the order they are defined in the enum. For example: EARTH(mass=2000, orbit=222).
	EARTH(2000, 222), MARS(66, 889), PLUTU(987, 668), JUPITER(40058, 988), MERCURY(
			12, 99);

	private int mass; //The first value in the parenthesis of each enum value.
	private int orbit; //The second value in the parenthesis of each enum value.

	//CTOR must be PRIVATE. It cannot be invoked programmatically.
	private Planet(int mass, int orbit) {
		this.mass = mass;
		this.orbit = orbit;
	}

	public int getMass() {
		return mass;
	}

	public int getOrbit() {
		return orbit;
	}

}
