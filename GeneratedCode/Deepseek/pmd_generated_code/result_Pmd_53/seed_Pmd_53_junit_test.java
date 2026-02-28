import junit.framework.*;

class Foo extends TestCase {
    private static void suite() {} // BUG: JUnitStaticSuite

    public void showBug() {
        suite();
    }
}