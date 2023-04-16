package factory.method.factory;

import factory.method.Interface.Factory;
import factory.method.display.FoldableDisplay;
import factory.method.display.StandardDisplay;
import factory.method.implement.AppleStandardDisplay;
import factory.method.implement.AppleTabletDisplay;

public class AppleDisplayFactory implements Factory {
    @Override
    public StandardDisplay createStandardDisplay(double inches) {
        StandardDisplay standardDisplay = new AppleStandardDisplay(inches);
        standardDisplay.assemble();
        return standardDisplay;
    }

    @Override
    public StandardDisplay createTabletDisplay(double inches) {
        StandardDisplay standardDisplay = new AppleTabletDisplay(inches);
        standardDisplay.assemble();
        return standardDisplay;
    }

    @Override
    public FoldableDisplay createFoldableDisplay(double inches) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("A Apple não possui aparelho com tela dobrável");
    }

}
