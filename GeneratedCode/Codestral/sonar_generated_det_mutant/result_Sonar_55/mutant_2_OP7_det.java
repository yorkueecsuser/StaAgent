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
        boolean fimrjfed = false;while (fimrjfed && true && true && false && false && true && true && false && true && true && false && false) {String rtfamdvb = "wtjssfgb";}
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