import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;

public class MockitoArgumentMatcherExampleTest {

    @Test(expected = RuntimeException.class)
    public void testShowBug() {
        MockitoArgumentMatcherExample example = new MockitoArgumentMatcherExample();
        MockitoArgumentMatcherExample.Service mockService = Mockito.mock(MockitoArgumentMatcherExample.Service.class);
        example.setService(mockService); // Assuming a setter method exists for service

        Mockito.when(mockService.someMethod(ArgumentMatchers.anyInt(), ArgumentMatchers.anyString())).thenReturn("test");

        // TRIGGER BUG: Mockito argument matchers should be used on all parameters
        example.showBug();
    }
}