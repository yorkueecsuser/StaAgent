import org.junit.Test;

class Superclass {
    public void initialize() {
        System.out.println("Superclass initialization");
    }
}

class Subclass extends Superclass {
    // BUG: OverridesJavaxInjectableMethod
    @Override
    public void initialize() {
        System.out.println("Subclass initialization");
    }

    public void showBug() {
        initialize();
    }
}

public class SubclassTest {

    @Test
    public void testShowBug() {
        Subclass subclass = new Subclass();
        subclass.showBug(); // TRIGGER BUG: OverridesJavaxInjectableMethod
    }
}