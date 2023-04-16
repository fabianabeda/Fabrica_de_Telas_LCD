package factory.method.Interface;

import java.util.concurrent.TimeUnit;

import factory.method.display.FoldableDisplay;
import factory.method.display.StandardDisplay;

public interface Factory {
    public StandardDisplay createStandardDisplay(double inches);

    public StandardDisplay createTabletDisplay(double inches);

    public FoldableDisplay createFoldableDisplay(double inches) throws Exception;

    public default void qualityTest(StandardDisplay standartDisplay) {
        System.out.print("Teste de Qualidade Aparelho Normal: ");
        for (int i = 1; i < 4; i++) {
            System.out.print("[*] ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" OK (passed) | Display :" + standartDisplay.getInches());
    }

    public default void qualityFoldable(FoldableDisplay foldableDisplay) {
        System.out.print("Teste de Qualidade Aparelho Dobrável: ");
        for (int i = 1; i < 4; i++) {
            System.out.print("[*] ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        foldableDisplay.dobrar();
        System.out.println(" OK (passed) | Display :" + foldableDisplay.getInches());
    }
}
