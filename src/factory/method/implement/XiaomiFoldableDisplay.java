package factory.method.implement;

import factory.method.display.FoldableDisplay;

public class XiaomiFoldableDisplay implements FoldableDisplay {
    private double inches;
    private String features;

    public XiaomiFoldableDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public double getInches() {
        return this.inches;
    }

    @Override
    public void dobrar() {
        System.out.println("Iniciando a dobra do Xiaomi");
        System.out.println("Testando...");
    }

    @Override
    public void assemble() {
        System.out.println("Display de um Xiaomi dobrável");
        features = getInches()
                + "\" Tela principal Dynamic AMOLED de 6,7 polegadas dobrável, tela externa Super AMOLED de 1,9 polegadas";
    }

    public String toString() {
        return this.features;
    }
}
