import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

interface UserSession {
    String getSessionInfo();
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
        if (session != null) {
            return session;
        }
        throw new UnauthorizedException("User is not authenticated");
    }

    public void set(UserSession session) {
        DELEGATE.set(session);
    }

    public void incorrectCleanup() {
        DELEGATE.set(null); // BUG: "ThreadLocal" variables should be cleaned up when no longer used
    }

    // This method demonstrates the bug by simulating a session set and incorrect cleanup
    public boolean showBug(UserSession session) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(() -> {
            set(session);
            incorrectCleanup(); // The bug occurs here
        });
        executor.shutdown();
        return true;
    }

    @Override
    public String getSessionInfo() {
        return "Dummy session info";
    }

    public static void main(String[] args) {
        ThreadLocalUserSession userSession = new ThreadLocalUserSession();
        userSession.showBug(userSession);
    }
}