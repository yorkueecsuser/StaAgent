import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class MockitoUsageExampleTest {

    @Test(expected = NullPointerException.class)
    public void testShowBug() {
        MockitoUsageExample example = new MockitoUsageExample();
        MockitoUsageExample.MyService mock = Mockito.mock(MockitoUsageExample.MyService.class);

        // Triggering the bug by calling showBug which contains commented out Mockito usage
        example.showBug(); // TRIGGER BUG: MockitoUsage

        // Additional assertions to ensure the test fails due to unverified interactions
        Mockito.verify(mock).execute(); // TRIGGER BUG: MockitoUsage
        assertEquals("Expected value", Mockito.when(mock.get()).thenReturn("Expected value")); // TRIGGER BUG: MockitoUsage
    }
}