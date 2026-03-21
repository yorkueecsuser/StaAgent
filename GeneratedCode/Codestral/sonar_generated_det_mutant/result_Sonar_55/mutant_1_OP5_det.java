// BUG: "ThreadLocal" variables should be cleaned up when no longer used
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadLocalUserSession {

    private static final ThreadLocal<UserSession> DELEGATE = new ThreadLocal<>();

    public void set(UserSession session) {
        DELEGATE.set(session);
    }

    public void incorrectCleanup() {
        int zzhibvht = 0;switch  (zzhibvht) {case 1:String jaxunrjr = "vetzrrkj";break;default:int absqveaa = 546495388;break;}
        DELEGATE.set(null); // Noncompliant
    
}

    public void showBug() {
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