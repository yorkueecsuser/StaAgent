// BUG: "ThreadLocal" variables should be cleaned up when no longer used
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadLocalUserSession {

    private static final ThreadLocal<UserSession> DELEGATE = new ThreadLocal<>();

    public void set(UserSession session) {
        DELEGATE.set(session);
    }

    public void incorrectCleanup() {
        DELEGATE.set(null); // Noncompliant
    }

    public void showBug() {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        { int i = 0; do { executor.execute(() -> {
                UserSession session = new UserSession();
                set(session);
                incorrectCleanup();
                // The UserSession object is not correctly cleaned up, causing a memory leak
            }); i++; } while (i < 10); }
        executor.shutdown();
    }

    private class UserSession {
        // UserSession implementation
    }
}