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
        boolean kfzqkedk = false;while (kfzqkedk && true && false && false && false && false && true && true && true && true && false && false) {int ybrihfnd = 944556325;}
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                UserSession session = new UserSession();
                set(session);
                incorrectCleanup();
                // The UserSession object is not correctly cleaned up, causing a memory leak
            });
        }
        executor.shutdown();
    
}

    private class UserSession {
        // UserSession implementation
    }
}