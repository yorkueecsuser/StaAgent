import junit.framework.*;

class ExampleBug extends TestCase {

    private int testData;

    public void setUp() { // BUG: JUnitSpelling
        testData = 10;
    }

    public void tearDown() { // BUG: JUnitSpelling
        testData = 0;
    }

    public void runExampleTest() {
        assertEquals(10, testData);
    }

    public int showBug() {
        runExampleTest();
        return testData;
    }

    // public static void main(String[] args) {
    //     ExampleBug example = new ExampleBug();
    //     example.showBug();
    // }
}