package factory.method.factory;

import factory.method.Interface.Factory;
import factory.method.display.FoldableDisplay;
import factory.method.display.StandardDisplay;
import factory.method.implement.XiaomiFoldableDisplay;
import factory.method.implement.XiaomiStandardDisplay;
import factory.method.implement.XiaomiTabletDisplay;

public class XiaomiDisplayFactory implements Factory {
    @Override
    public StandardDisplay createStandardDisplay(double inches) {
        StandardDisplay standardDisplay = new XiaomiStandardDisplay(inches);
        standardDisplay.assemble();
        return standardDisplay;
    }

    @Override
    public StandardDisplay createTabletDisplay(double inches) {
        StandardDisplay standardDisplay = new XiaomiTabletDisplay(inches);
        standardDisplay.assemble();
        return standardDisplay;
    }

    @Override
    public FoldableDisplay createFoldableDisplay(double inches) {
        FoldableDisplay foldableDisplay = new XiaomiFoldableDisplay(inches);
        foldableDisplay.assemble();
        return foldableDisplay;
    }

}
