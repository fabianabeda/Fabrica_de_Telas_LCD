package factory.method.implement;

import factory.method.display.StandardDisplay;

public class AppleStandardDisplay implements StandardDisplay {
	private double inches;
	private String features;

	public AppleStandardDisplay(double inches) {
		this.inches = inches;
		features = getInches()
				+ "\" Super Retina XDR OLED, 6,1 polegadas, 2532 x 1170 pixels (460 pixels por polegada)";
	}

	@Override
	public void assemble() {
		System.out.println("Display de um Iphone Normal");
	}

	@Override
	public double getInches() {
		return inches;
	}

	public String toString() {
		return features;
	}

}
