import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

class ExampleTestCase extends TestCase {

    // Incorrect return type and declaration for suite method
    public static List suite() { // BUG: IJU: TestCase declares a bad suite method (IJU_BAD_SUITE_METHOD)
        return new ArrayList();
    }

    public void testExample() {
        // A simple test case
        assertTrue(true);
    }

    public List showBug() {
        return suite(); // Call the buggy suite method
    }

    public static void main(String[] args) {
        ExampleTestCase test = new ExampleTestCase();
        List result = test.showBug();
        System.out.println("Result from showBug: " + result);
    }
}