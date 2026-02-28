import javax.naming.AuthenticationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

interface UserSession {
    // Dummy interface
}

@RunWith(MockitoJUnitRunner.class)
public class ThreadLocalUserSessionTest {
    private ThreadLocalUserSession session = new ThreadLocalUserSession();

    // TRIGGER BUG: "ThreadLocal" variables should be cleaned up when no longer used
    @Test(expected = AuthenticationException.class)
    public void testIncorrectCleanUp() {
        session.showBug();
    }

    @Test(expected = AuthenticationException.class)
    public void testIncorrectCleanUpWithSession() {
        session.showBug(new UserSession() {
            @Override
            public String toString() {
                return super.toString();
            }
        });
    }
}

class ThreadLocalUserSession implements UserSession {

    private static final ThreadLocal<UserSession> DELEGATE = new ThreadLocal<>();

    public UserSession get() {
        UserSession session = DELEGATE.get();
        if (session!= null) {
            return session;
        }
        throw new AuthenticationException("User is not authenticated");
    }

    public void set(UserSession session) {
        DELEGATE.set(session);
    }

    public void incorrectCleanup() {
        DELEGATE.set(null); 
    }

    public void showBug() {
        incorrectCleanup();
        get();
    }

    public void showBug(UserSession session) {
        set(session);
        incorrectCleanup();
        get();
    }
}