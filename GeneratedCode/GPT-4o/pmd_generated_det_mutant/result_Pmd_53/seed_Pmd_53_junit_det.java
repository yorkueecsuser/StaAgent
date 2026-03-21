import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

class Example extends TestCase {

    // This method should be public and static to be recognized correctly by JUnit
    void suite() {
        // BUG: JUnitStaticSuite
    } 

    // This method should be public to be recognized correctly by JUnit
    private static void anotherSuite() {
        // BUG: JUnitStaticSuite
    }

    public void showBug() {
        Example example = new Example();
        example.suite();
        anotherSuite();
    }
}