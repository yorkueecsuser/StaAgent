import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class MockitoUsageBugTest {

    @Test
    public void testShowBug() {
        MyInterface mock = Mockito.mock(MyInterface.class);
        Mockito.when(mock.get()).thenReturn(2);
        int result = mock.get();
        // TRIGGER BUG: MockitoUsage
        Mockito.verify(mock).execute();
    }
}