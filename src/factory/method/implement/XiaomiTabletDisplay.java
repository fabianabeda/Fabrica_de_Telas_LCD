package factory.method.implement;

import factory.method.display.StandardDisplay;

public class XiaomiTabletDisplay implements StandardDisplay {
    private double inches;
    private String features;

    public XiaomiTabletDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public void assemble() {
        System.out.println("Display de um tablete da Xiaomi");
        features = getInches() + "\" Mi Pad 5, tela de 11 ou 10,95 polegadas";
    }

    @Override
    public double getInches() {
        return this.inches;
    }

    public String toString() {
        return features;
    }
}