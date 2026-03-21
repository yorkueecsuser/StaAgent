import org.junit.Test;
import static org.junit.Assert.*;

public class UselessEasyMockCallTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        UselessEasyMockCall obj = new UselessEasyMockCall();
        obj.showBug();
    }
}