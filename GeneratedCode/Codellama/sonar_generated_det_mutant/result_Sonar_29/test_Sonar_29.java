import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TestClassTest {

    @Test
    public void testMethod() {
        String expected = "expected";
        String actual = "actual";
        TestClass testClass = mock(TestClass.class);

        // TRIGGER BUG: Mockito argument matchers should be used on all parameters
        when(testClass.getTestMethod(eq(expected), any(String.class))).thenReturn(actual);

        assertEquals(expected, testClass.getTestMethod(expected, actual));
    }
}