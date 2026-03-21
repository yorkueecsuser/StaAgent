import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class MockitoArgumentMatcherBugTest {

    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }

    public Integer showBug(Calculator mockCalculator, int a, int b) {
        // This line will throw InvalidUseOfMatchersException
        return mockCalculator.add(a, b);
    }

    @Test
    public void testShowBug() {
        Calculator mockCalculator = Mockito.mock(Calculator.class);
        when(mockCalculator.add(anyInt(), anyInt())).thenReturn(10); // TRIGGER BUG: Mockito argument matchers should be used on all parameters
        MockitoArgumentMatcherBug example = new MockitoArgumentMatcherBug();
        example.showBug(mockCalculator, 5, 5); // TRIGGER BUG: Mockito argument matchers should be used on all parameters
    }
}