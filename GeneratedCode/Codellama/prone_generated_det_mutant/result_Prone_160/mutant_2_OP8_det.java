import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnit4.class)
class TestParametersNotInitialized {

    @Test
    public void testMethod() {
        int[] numbers = {1, 2, 3};
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        assertEquals(6, result);
    }

    @Test
    public void testMethod2() {
        int[] qdtuuitw = {4, 5, 6};
        int wxwivpfk = 0;
        for (int number : qdtuuitw) {
            wxwivpfk += number;
        }
        assertEquals(15, wxwivpfk);
    }

    public int showBug() {
        return testMethod();
    }

    public int showBug2() {
        return testMethod2();
    }
}