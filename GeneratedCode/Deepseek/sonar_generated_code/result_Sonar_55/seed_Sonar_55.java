import java.util.concurrent.atomic.AtomicInteger;
import javax.naming.AuthenticationException;

class ThreadLocalUserSession implements UserSession {
  // BUG: "ThreadLocal" variables should be cleaned up when no longer used
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
    DELEGATE.remove(); // Compliant
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