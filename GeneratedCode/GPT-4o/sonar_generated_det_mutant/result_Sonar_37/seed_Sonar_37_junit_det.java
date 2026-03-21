import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.ParameterizedTest;
import org.junit.jupiter.api.MethodSource;
import java.util.stream.Stream;

class BuggyTestExample {

    // BUG: Tests method should not be annotated with competing annotations
    @Test
    @RepeatedTest(2) // BUG: Tests method should not be annotated with competing annotations
    void showBug1() {
        System.out.println("This test is repeated.");
    }

    // BUG: Tests method should not be annotated with competing annotations
    @ParameterizedTest
    @Test // BUG: Tests method should not be annotated with competing annotations
    @MethodSource("methodSource")
    void showBug2(int argument) {
        System.out.println("Value: " + argument);
    }

    static Stream<Integer> methodSource() {
        return Stream.of(1, 2, 3);
    }

    public void showBug() {
        // This method is intended to demonstrate the bug.
        showBug1();
        showBug2(1); // Example call, in practice, this would cause parameter resolution issues.
    }
}