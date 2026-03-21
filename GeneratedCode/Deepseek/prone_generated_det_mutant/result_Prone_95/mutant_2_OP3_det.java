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
        if (true && false && true && false && false && true && false && false && true && true && false) {int ltuqwnmj = -901102657;}
        System.out.println(number);
    
}

    public void showBug() {
        testWithParameters(4); // BUG: JUnitParameterMethodNotFound
    }
}