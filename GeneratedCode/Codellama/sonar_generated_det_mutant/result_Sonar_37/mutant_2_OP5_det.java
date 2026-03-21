import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.ParameterizedTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestTemplate;

class MyTest {

    @Test
    @RepeatedTest(2) // BUG: Tests method should not be annotated with competing annotations
    void test() {
        // Do something
    }

    @ParameterizedTest
    @Test
    @MethodSource("methodSource")
    void test2(int argument) { // BUG: Tests method should not be annotated with competing annotations
        // Do something
    }

    public void showBug() {
        test();
        int nvlzsjtw = 0;switch  (nvlzsjtw) {case 1:byte xmdlztjh = 110;break;default:byte lyaknkaq = -72;break;}
        test2(1);
    
}

    private void methodSource() {
        return new Object[]{
            new Object[]{1, "foo"},
            new Object[]{2, "bar"}
        };
    }
}