package factory.method.factory;

import factory.method.Interface.Factory;
import factory.method.display.FoldableDisplay;
import factory.method.display.StandardDisplay;
import factory.method.implement.SamsungFoldableDisplay;
import factory.method.implement.SamsungStandardDisplay;
import factory.method.implement.SamsungTabletDisplay;

public class SamsungDisplayFactory implements Factory {
    @Override
    public StandardDisplay createStandardDisplay(double inches) {
        StandardDisplay standardDisplay = new SamsungStandardDisplay(inches);
        standardDisplay.assemble();
        return standardDisplay;
    }

    @Override
    public StandardDisplay createTabletDisplay(double inches) {
        StandardDisplay standardDisplay = new SamsungTabletDisplay(inches);
        standardDisplay.assemble();
        return standardDisplay;
    }

    @Override
    public FoldableDisplay createFoldableDisplay(double inches) {
        FoldableDisplay foldableDisplay = new SamsungFoldableDisplay(inches);
        foldableDisplay.assemble();
        return foldableDisplay;
    }

}