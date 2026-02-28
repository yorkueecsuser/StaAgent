import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Method;
import java.util.stream.Stream;

class BuggyCode {
    
    @RepeatedTest(2) // BUG: Tests method should not be annotated with competing annotations
    public void test() { 
        System.out.println("Test passed");
    }

    @ParameterizedTest
    public void test2(int argument) { 
        System.out.println("Test2 passed with argument " + argument);
    }

    public static Stream<Integer> methodSource() {
        return Stream.of(1, 2, 3, 4, 5);
    }

    public void showBug() {
        try {
            Method method = BuggyCode.class.getMethod("test");
            method.invoke(new BuggyCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showBug2() {
        try {
            Method method = BuggyCode.class.getMethod("test2", int.class);
            method.invoke(new BuggyCode(), 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}