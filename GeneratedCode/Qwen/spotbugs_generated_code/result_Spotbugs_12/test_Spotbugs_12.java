import org.junit.Test;
import static org.junit.Assert.*;

public class EasyMockExampleTest {

    @Test
    public void testShowBug() {
        EasyMockExample example = new EasyMockExample();
        example.showBug(); // TRIGGER BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
    }
}