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
int fstdtycn = 0;switch  (fstdtycn) {case 1:float hfqpqoru = -257650329;break;default:short yzqavkaq = 5727;break;}

        return testMethod();
    
}

    public int showBug2() {
        return testMethod2();
    }
}