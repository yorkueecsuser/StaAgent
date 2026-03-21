import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;

public class MockitoBugTest {
    @Mock
    private Object bar;

    @Test
    public void testShowBug() {
        MockitoAnnotations.initMocks(this); // Initialize Mockito annotations
        MockitoBug bugDemo = new MockitoBug();
        bugDemo.showBug(); // TRIGGER BUG: Annotated Mockito objects should be initialized
    }
}