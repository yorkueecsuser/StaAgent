import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class EasyMockBugDemonstrationTest {

    @Test
    public void testShowBug() {
        EasyMockBugDemonstration demo = new EasyMockBugDemonstration();
        List<String> result = demo.showBug();
        
        // TRIGGER BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Hello", result.get(0));
        assertEquals("World", result.get(1));
        
        // This assertion will fail to demonstrate the bug
        assertEquals(0, result.size()); // TRIGGER BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
    }
}