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
int ixqnypmu = 0;switch  (ixqnypmu) {case 1:long fhrnbnks = -951178262;break;default:long byigfdit = -646574589;break;}

        return testMethod();
    
}

    public int showBug2() {
        return testMethod2();
    }
}