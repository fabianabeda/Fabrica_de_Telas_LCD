package factory.method.implement;

import factory.method.display.FoldableDisplay;

public class SamsungFoldableDisplay implements FoldableDisplay {
    private double inches;
    private String features;

    public SamsungFoldableDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public double getInches() {
        return this.inches;
    }

    @Override
    public void dobrar() {
        System.out.println("Iniciando a dobra do Samasung");
        System.out.println("Testando...");
    }

    @Override
    public void assemble() {
        System.out.println("Display de um Samsung dobrável");
        features = getInches()
                + "\" Tela principal Dynamic AMOLED 2X de 7,6 polegadas e tela externa Super AMOLED de 6,2 polegadas";
    }

    public String toString() {
        return this.features;
    }
}