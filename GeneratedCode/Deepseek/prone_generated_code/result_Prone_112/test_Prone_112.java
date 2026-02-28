import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class MockitoUsageTest {
    @Test
    public void testShowBug() {
        MockitoUsage usage = new MockitoUsage();
        usage.showBug();

        // TRIGGER BUG: MockitoUsage
        Mockito.verify(usage).execute(); // This line triggers the bug
    }
}

class MockitoUsage {
    public void showBug() {
        MyInterface mock = Mockito.mock(MyInterface.class);
        Mockito.when(mock.get()).thenReturn(null);
        mock.execute();
    }
}

interface MyInterface {
    void execute();
    void get();
}