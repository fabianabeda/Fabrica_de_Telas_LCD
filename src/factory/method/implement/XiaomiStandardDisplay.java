package factory.method.implement;

import factory.method.display.StandardDisplay;

public class XiaomiStandardDisplay implements StandardDisplay {
    private double inches;
    private String features;

    public XiaomiStandardDisplay(double inches) {
        this.inches = inches;
        features = getInches() + "\" Tela AMOLED Full HD+ de 6,43 polegadas, Snapdragon 678, 4-6GB de RAM";
    }

    @Override
    public void assemble() {
        System.out.println("Display de um Xiaomi Normal");
    }

    @Override
    public double getInches() {
        return inches;
    }

    public String toString() {
        return features;
    }

}
