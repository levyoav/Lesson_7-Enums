package enumExamples.planets;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

	private List<Planet> planets = new ArrayList<>();

	public void add(Planet planet) {
		planets.add(planet);
	}



	@Override
	public String toString() {
		return "SolarSystem [planets=" + planets + "]";
	}


	public static void main(String[] args) {

		SolarSystem solarSystem = new SolarSystem();

		solarSystem.add(Planet.EARTH);
		solarSystem.add(Planet.JUPITER);

		//Only the enum values are printed. Not their attributes.
		System.out.println(solarSystem);

		System.out.println("earth mass: " + Planet.EARTH.getMass());

	}

}
