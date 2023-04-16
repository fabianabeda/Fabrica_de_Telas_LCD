package factory.method.implement;

import factory.method.display.StandardDisplay;

public class SamsungTabletDisplay implements StandardDisplay {

    private double inches;
    private String features;

    public SamsungTabletDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public void assemble() {
        System.out.println("Display de um Tablete Samsung");
        features = getInches() + "\" Tela Super AMOLED de 12,4 polegadas, processador Snapdragon 865 Plus";
    }

    @Override
    public double getInches() {
        return this.inches;
    }

    public String toString() {
        return features;
    }
}
