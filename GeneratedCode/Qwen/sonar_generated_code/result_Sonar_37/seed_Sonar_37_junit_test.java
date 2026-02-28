import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ExampleBugDemonstration {

    @Test
    @RepeatedTest(2) // BUG: Tests method should not be annotated with competing annotations
    void exampleMethod() {
        System.out.println("This method is incorrectly annotated.");
    }

    @ParameterizedTest
    @Test
    @MethodSource("methodSource")
    void exampleParameterizedMethod(int argument) { // BUG: Tests method should not be annotated with competing annotations
        System.out.println("Parameterized method with incorrect annotations: " + argument);
    }

    static int[] methodSource() {
        return new int[]{1, 2, 3};
    }

    public String showBug1() {
        exampleMethod();
        return "Check console for repeated output of exampleMethod.";
    }

    public String showBug2() {
        exampleParameterizedMethod(1);
        return "Check console for error related to exampleParameterizedMethod.";
    }
}