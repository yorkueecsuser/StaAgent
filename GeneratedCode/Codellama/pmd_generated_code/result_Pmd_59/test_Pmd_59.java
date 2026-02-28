import org.junit.Test;
import static org.junit.Assert.*;

public class NonCaseLabelInSwitchStatementTest {
    @Test
    public void testTriggerBug() {
        // TRIGGER BUG: NonCaseLabelInSwitchStatement
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 1:
                    sum += numbers[i];
                    break;
                case 2:
                    sum += numbers[i];
                    break;
                case 3:
                    sum += numbers[i];
                    break;
                case 4:
                    sum += numbers[i];
                    break;
                case 5:
                    sum += numbers[i];
                    break;
                default:
            }
        }
        assertEquals(15, sum);
    }
}