import java.lang.ThreadLocal;

class UserSession {
    // This is a placeholder to demonstrate the bug.
    // This class should be properly implemented with real functionality.
}

class UnauthorizedException extends RuntimeException {
    // This is a placeholder to demonstrate the bug.
    // This class should be properly implemented with real functionality.
    public UnauthorizedException(String message) {
        super(message);
    }
}

class ThreadLocalUserSession {

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
    DELEGATE.set(null); // BUG: "ThreadLocal" variables should be cleaned up when no longer used
  }

  public void showBug() {
    UserSession session = new UserSession();
    set(session);
    incorrectCleanup(); // Simulating no longer using the session
    // The session is not properly cleaned up, causing a memory leak
  }
}