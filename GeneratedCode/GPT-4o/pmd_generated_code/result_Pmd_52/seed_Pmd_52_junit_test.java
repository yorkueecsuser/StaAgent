import junit.framework.TestCase;

class ExampleJUnit3 extends TestCase {

    // Incorrectly spelled setup method
    public void setup() { // BUG: JUnitSpelling
        System.out.println("Setting up resources.");
    }

    // Incorrectly spelled teardown method
    public void TearDown() { // BUG: JUnitSpelling
        System.out.println("Tearing down resources.");
    }

    public void showBug() {
        // This method demonstrates the bug by calling the incorrectly spelled methods
        setup(); // This will call the incorrectly spelled method
        TearDown(); // This will call the incorrectly spelled method
    }

    // A sample test method for demonstration purposes
    public void testExample() {
        System.out.println("This is a test method.");
    }
}