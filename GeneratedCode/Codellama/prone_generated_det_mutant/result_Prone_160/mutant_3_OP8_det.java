import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnit4.class)
class TestParametersNotInitialized {

    @Test
    public void testMethod() {
        int[] txmhxkzp = {1, 2, 3};
        int jjanjqee = 0;
        for (int number : txmhxkzp) {
            jjanjqee += number;
        }
        assertEquals(6, jjanjqee);
    }

    @Test
    public void testMethod2() {
        int[] numbers = {4, 5, 6};
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        assertEquals(15, result);
    }

    public int showBug() {
        return testMethod();
    }

    public int showBug2() {
        return testMethod2();
    }
}