import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RunWith(MockitoJUnitRunner.class)
public class NonSerializableSessionObjectBugTest {

    @Mock
    private HttpServletRequest mockedRequest;

    @Mock
    private HttpSession mockedSession;

    @Test
    public void testNonSerializableObjectInSession() {
        NonSerializableSessionObjectBug buggyClass = new NonSerializableSessionObjectBug();

        Mockito.when(mockedRequest.getSession()).thenReturn(mockedSession);

        // TRIGGER BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        buggyClass.showBug(mockedRequest);
        try {
            Mockito.verify(mockedSession).setAttribute(Mockito.eq("address"), Mockito.any());
        } catch (Exception e) {
            assertTrue(e instanceof java.io.NotSerializableException);
        }
    }
}