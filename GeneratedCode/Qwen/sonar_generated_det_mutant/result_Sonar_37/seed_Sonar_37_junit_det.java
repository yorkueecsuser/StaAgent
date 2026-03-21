import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ExampleBugDemonstrator {

    // This method demonstrates the bug by having both @Test and @RepeatedTest annotations
    @Test
    @RepeatedTest(2) // BUG: Tests method should not be annotated with competing annotations
    void exampleMethod() {
        System.out.println("This method is incorrectly annotated.");
    }

    // This method demonstrates the bug by having both @ParameterizedTest and @Test annotations
    @ParameterizedTest
    @Test
    @MethodSource("methodSource")
    void exampleMethod2(int argument) { // BUG: Tests method should not be annotated with competing annotations
        System.out.println("Argument: " + argument);
    }

    // Method source for parameterized test
    static java.util.stream.Stream<Integer> methodSource() {
        return java.util.stream.Stream.of(1, 2, 3);
    }

    // Public method to demonstrate the bug
    public void showBug() {
        exampleMethod();
        exampleMethod2(1); // This call will cause issues due to incorrect annotations
    }
}