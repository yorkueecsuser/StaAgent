import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
class ParameterizedTest {
    private final int input;
    private final int expected;

    public ParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters // BUG: JUnitParameterMethodNotFound
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                 { 0, 0 },
                 { 1, 1 },
                 { 2, 4 },
                 { 3, 9 },
                 { 4, 16 },
        });
    }

    @Test
    public void test() {
        assertEquals(expected, square(input));
    }

    public int square(int a) {
        return a * a;
    }

    public void showBug() {
        test();
    }
}