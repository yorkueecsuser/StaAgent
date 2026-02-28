import junit.framework.TestCase;
import java.util.Random;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // This method will not execute any tests
        // It is present to demonstrate the bug
    }

    // Mutation Operator: Dead Store
    private int deadStoreVariable;

    public MyTest() {
        // Initialize the dead store variable with a random value
        Random rand = new Random();
        deadStoreVariable = rand.nextInt(100);
    }
}