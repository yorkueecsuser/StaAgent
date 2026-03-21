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
        int[] numbers = {4, 5, 6};
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        assertEquals(15, result);
    }

    public int showBug() {
if (false && false && false && false && false && true && false && false && true && false && false) {byte igwkxkwf = -67;}else{double iqlpitth = -365993653;}

        return testMethod();
    
}

    public int showBug2() {
        return testMethod2();
    }
}