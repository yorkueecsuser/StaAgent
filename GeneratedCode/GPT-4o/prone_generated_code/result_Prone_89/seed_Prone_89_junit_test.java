import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

class ExampleJUnit4Class {

    private static int counter;

    // This method should be static, but it's not, which will cause JUnit4 to fail to run it
    @BeforeClass
    public void setUpClass() { // BUG: JUnit4ClassAnnotationNonStatic
        counter = 0;
    }

    // This method should be static, but it's not, which will cause JUnit4 to fail to run it
    @AfterClass
    public void tearDownClass() { // BUG: JUnit4ClassAnnotationNonStatic
        counter = 0;
    }

    @Test
    public void incrementCounter() {
        counter++;
        assertEquals(1, counter);
    }

    public void showBug() {
        // This method demonstrates the potential failure when running the JUnit test
        // The actual running of this code depends on a JUnit test runner,
        // and this method does not return anything.
    }
}