import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterTestExample {

    @TestParameter
    private int parameterValue;

    @Test
    public void demonstrateBug() {
        System.out.println("Parameter Value: " + parameterValue); // BUG: TestParametersNotInitialized
    }

    public int showBug() {
        demonstrateBug();
        return parameterValue;
    }

    // Mock annotation to simulate @TestParameter since it's generally part of a specific library
    public @interface TestParameter {}
}