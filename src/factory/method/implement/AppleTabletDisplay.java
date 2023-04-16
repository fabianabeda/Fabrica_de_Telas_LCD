package factory.method.implement;

import factory.method.display.StandardDisplay;

public class AppleTabletDisplay implements StandardDisplay {
    private double inches;
    private String features;

    public AppleTabletDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public void assemble() {
        System.out.println("Display de um Tablete da Apple");
        features = getInches() + "\" Tela Liquid Retina XDR de 12, 128GB a 2TB de armazenamento";
    }

    @Override
    public double getInches() {
        return this.inches;
    }

    public String toString() {
        return features;
    }
}
