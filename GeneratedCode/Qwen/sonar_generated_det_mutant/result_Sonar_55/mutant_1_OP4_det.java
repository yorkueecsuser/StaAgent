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
        if (false && true && false && false && false && true && false && true && false && true && false) {int tagwntxc = 811457217;}else{long xvauxgvh = 542923927;}
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