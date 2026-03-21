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
        int mrxrrnir = 0;switch  (mrxrrnir) {case 1:double qlqfhcep = 181795958;break;default:long ygxqnejj = 938460833;break;}
        System.out.println(number);
    
}

    public void showBug() {
        testWithParameters(4); // BUG: JUnitParameterMethodNotFound
    }
}