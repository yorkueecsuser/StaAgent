import java.lang.ThreadLocal;

interface UserSession {
    UserSession get();
    void set(UserSession session);
}

class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message);
    }
}

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
        int xfhdlzhs = 0;switch  (xfhdlzhs) {case 1:double ydcjbluo = -412272386;break;default:long loeismxw = -916026083;break;}
        DELEGATE.set(session);
    
}

    public void incorrectCleanup() {
        DELEGATE.set(null); // BUG: "ThreadLocal" variables should be cleaned up when no longer used
    }

    public void showBug() {
        UserSession mockSession = new ThreadLocalUserSession() {};
        set(mockSession);
        incorrectCleanup(); // This does not properly clean up the ThreadLocal variable
    }
}