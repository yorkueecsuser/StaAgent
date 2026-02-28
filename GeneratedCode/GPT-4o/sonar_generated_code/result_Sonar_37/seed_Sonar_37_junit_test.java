import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.ParameterizedTest;
import org.junit.jupiter.api.MethodSource;
import java.util.stream.Stream;

class CompetingAnnotationsExample {

    // BUG: Tests method should not be annotated with competing annotations
    @Test
    @RepeatedTest(2) // BUG: Tests method should not be annotated with competing annotations
    void exampleTest() {
        System.out.println("This is a test with competing annotations.");
    }

    // BUG: Tests method should not be annotated with competing annotations
    @ParameterizedTest
    @Test
    @MethodSource("provideArgs")
    void exampleTest2(int argument) { // BUG: Tests method should not be annotated with competing annotations
        System.out.println("Argument: " + argument);
    }

    static Stream<Integer> provideArgs() {
        return Stream.of(1, 2, 3);
    }

    public void showBug() {
        exampleTest();
        exampleTest2(1);
    }
}