import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class BugExample {
    @Test // Noncompliant
    @RepeatedTest(2) // Noncompliant
    public void showBug() {
        // BUG: Tests method should not be annotated with competing annotations
    }

    @ParameterizedTest // Noncompliant
    @RepeatedTest(2) // Noncompliant
    @MethodSource("methodSource")
    public void showBug2(int argument) {
        // BUG: Tests method should not be annotated with competing annotations
    }

    private static int[] methodSource() {
        return new int[]{1, 2, 3};
    }
}