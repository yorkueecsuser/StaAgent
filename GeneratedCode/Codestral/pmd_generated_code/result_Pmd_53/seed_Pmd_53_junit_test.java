// Java code demonstrating the JUnitStaticSuite bug
import junit.framework.*;

class Foo extends TestCase {
    private static void suite() {} // BUG: JUnitStaticSuite - oops, should be public

    public void testMethod() {} // placeholder test method

    public static void showBug() {
        JUnitCore.runClasses(Foo.class); // This will throw an exception due to the bug
    }
}