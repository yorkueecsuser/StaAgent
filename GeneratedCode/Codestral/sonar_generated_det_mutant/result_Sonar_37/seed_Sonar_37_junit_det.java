import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BuggyTest {
    // BUG: Tests method should not be annotated with competing annotations
    @Test
    @RepeatedTest(2) // Noncompliant, this test will be repeated 3 times
    void test() {
        System.out.println("Running test...");
    }

    @ParameterizedTest
    @Test // Noncompliant, this test will fail with ParameterResolutionException
    @ValueSource(ints = {1, 2, 3})
    void test2(int argument) {
        System.out.println("Running parameterized test with argument: " + argument);
    }

    public void showBug() {
        test(); // This will print "Running test..." 3 times due to the bug
        test2(0); // This will throw ParameterResolutionException due to the bug
    }
}