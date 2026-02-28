import org.junit.Test;
import static org.junit.Assert.*;

class JUnit3TestNotRunTest {
    @Test
    public void testShowBug() {
        JUnit3TestNotRun junit3TestNotRun = new JUnit3TestNotRun();
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        int result = junit3TestNotRun.showBug();
        assertEquals(15, result);
    }
}