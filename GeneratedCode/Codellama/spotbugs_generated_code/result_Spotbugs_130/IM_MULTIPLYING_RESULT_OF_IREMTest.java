import org.junit.Test;
import static org.junit.Assert.*;

class IM_MULTIPLYING_RESULT_OF_IREMTest {

    @Test
    public void testTriggerBug() {
        // Create a new instance of the class
        IM_MULTIPLYING_RESULT_OF_IREM instance = new IM_MULTIPLYING_RESULT_OF_IREM();

        // Set the values of i and j
        int i = 100;
        int j = 10;

        // Call the showBug method with the values of i and j
        instance.showBug(i, j);

        // The bug should be triggered, and the test should fail
        fail("The bug was not triggered");
    }
}