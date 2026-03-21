import org.mockito.Mockito;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class MockitoBugTest {

    @Test
    public void testShowBug() {
        MockitoBug mockitoBug = new MockitoBug();
        mockitoBug.showBug(); // TRIGGER BUG: Mockito argument matchers should be used on all parameters
    }

    @Test
    public void testShowBug2() {
        MockitoBug mockitoBug = new MockitoBug();
        mockitoBug.showBug2(); // TRIGGER BUG: Mockito argument matchers should be used on all parameters
    }
}