import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
class ParameterizedTestBug {
    private int testParameter;

    public ParameterizedTestBug(int testParameter) {
        this.testParameter = testParameter;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { {1}, {2}, {3} });
    }

    @Test
    public void testMethod() {
        // The testParameter will not be initialized correctly
        // because we are using the default JUnit4 runner.
        // BUG: TestParametersNotInitialized
        System.out.println("Test parameter value: " + testParameter);
    }

    public void showBug() {
        testMethod(); // Calling the method to demonstrate the bug
    }
}