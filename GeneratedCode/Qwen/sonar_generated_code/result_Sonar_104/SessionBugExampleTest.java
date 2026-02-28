import org.junit.Test;
import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mockito.Mockito;

public class SessionBugExampleTest {

    @Test(expected = IllegalArgumentException.class)
    public void testShowBug() {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpSession session = Mockito.mock(HttpSession.class);
        Mockito.when(request.getSession()).thenReturn(session);

        SessionBugExample example = new SessionBugExample();
        example.showBug(request);  // TRIGGER BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    }
}