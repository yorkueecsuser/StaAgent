// BUG: Tests method should not be annotated with competing annotations
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MultipleTestAnnotations {

    @Test // Noncompliant, this test will be executed twice
    @RepeatedTest(2)
    void test1() {
        System.out.println("Test 1");
    }

    @ParameterizedTest // Noncompliant, this test will fail with ParameterResolutionException
    @Test
    @ValueSource(ints = {1, 2})
    void test2(int argument) {
        System.out.println("Test 2 with argument: " + argument);
    }

    public void showBug() {
        test1();
        test2(0); // This will throw ParameterResolutionException
    }
}