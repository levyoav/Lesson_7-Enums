package enumExamples.cars;

import java.util.Arrays;

import javax.swing.JOptionPane;

import enumExamples.cars.Car.Color;

public class CarTest {

	public static void main(String[] args) {

		//Creates a Car object with the color 'GREEN' and manufacturer 'SUSITA'.
		Car c1 = new Car(100, Color.GREEN, Manufacturer.SUSITA);
		System.out.println(c1);
		c1.setColor(Color.RED);

		//values() method returns the list if enum values.
		Color[] colors = Color.values();

		System.out.println(Arrays.toString(colors));

		//Opens a GUI window with a String type input field. The String from the
		//input is stored in 'color'.
		String color = JOptionPane.showInputDialog("Enter Color");

		System.out.println(color);

		//The String stored in 'color' is converted to the enum Color. If the 
		//String received from the input is not compatible with any of the colors
		//defined in the enum (is case sensitive), an exception will be thrown.
		Color colorFromUser = Color.valueOf(color);

		c1.setColor(colorFromUser);
		System.out.println(c1);

		//ordinal() prints the index of the enum value. In this case, for 'BLACK'
		//0 printed.
		System.out.println(Color.BLACK.ordinal());

	}
}
