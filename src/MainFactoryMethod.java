import factory.method.Interface.Factory;
import factory.method.display.FoldableDisplay;
import factory.method.display.StandardDisplay;
import factory.method.factory.AppleDisplayFactory;
import factory.method.factory.SamsungDisplayFactory;
import factory.method.factory.XiaomiDisplayFactory;

public class MainFactoryMethod {

	public static void main(String args[]) throws Exception {
		Factory appleFactory = new AppleDisplayFactory();
		FactoryTest(appleFactory);

		Factory samsungFactory = new SamsungDisplayFactory();
		FactoryTest(samsungFactory);

		Factory xiaomiFactory = new XiaomiDisplayFactory();
		FactoryTest(xiaomiFactory);

	}

	private static void FactoryTest(Factory factory) throws Exception {
		StandardDisplay standardDisplay;
		FoldableDisplay foldableDisplay;

		System.out.println();
		System.out.println();
		standardDisplay = factory.createStandardDisplay(6.6);
		System.out.println(standardDisplay);
		System.out.println();
		System.out.println();
		standardDisplay = factory.createTabletDisplay(10.9);
		System.out.println(standardDisplay);
		System.out.println();
		System.out.println();
		try {
			foldableDisplay = factory.createFoldableDisplay(7.6);
			System.out.println(foldableDisplay);
		} catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
	}
}
