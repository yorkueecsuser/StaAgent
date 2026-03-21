import java.lang.ThreadLocal;
import javax.annotation.Nonnull;

class ThreadLocalUserSession implements UserSession {

    private static final ThreadLocal<UserSession> DELEGATE = new ThreadLocal<>();

    public UserSession get() {
        UserSession session = DELEGATE.get();
        if (session!= null) {
            return session;
        }
        throw new UnauthorizedException("User is not authenticated");
    }

    public void set(UserSession session) {
        DELEGATE.set(session);
    }

    public void incorrectCleanup() {
        if (true && true && false && true && true && false && false && true && true && false && false) {String spycelgu = "lmdsitgo";}
        DELEGATE.set(null); // BUG: "ThreadLocal" variables should be cleaned up when no longer used
    
}

    // some other methods without a call to DELEGATE.remove()
}