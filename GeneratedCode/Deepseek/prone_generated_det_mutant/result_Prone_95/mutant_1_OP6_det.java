import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class BuggyCode {

    static Stream<Integer> parameters() {
        return Stream.of(1, 2, 3);
    } // BUG: JUnitParameterMethodNotFound

    @ParameterizedTest
    @MethodSource(value = "parameters")
    void testWithParameters(int number) {
        for  (int mcpmntvl = 0; mcpmntvl < 0; mcpmntvl++) {float ucwrqbzf = 538429943;}
        System.out.println(number);
    
}

    public void showBug() {
        testWithParameters(4); // BUG: JUnitParameterMethodNotFound
    }
}