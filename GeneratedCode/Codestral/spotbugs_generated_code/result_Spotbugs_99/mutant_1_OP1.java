import junit.framework.TestCase;
import java.util.Random;

class MyTest extends TestCase {
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
    // There are no test methods implemented in this TestCase

    public void showBug() {
        // Dead Store Mutation Operator: Adding an unused variable declaration
        int deadStoreVariable = getRandomNumber();

        // This method will not execute any tests
        // It is present to demonstrate the bug
    }

    private int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}