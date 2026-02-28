import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
    ExecutorService executorService = Executors.newFixedThreadPool(1);
    executorService.submit(() -> {
      set(new UserSessionImpl("user123"));
      System.out.println("Session set: " + get().getUserId());
      incorrectCleanup(); // This does not properly clean up the ThreadLocal
    });
    executorService.shutdown();
  }

  public static void main(String[] args) {
    ThreadLocalUserSession sessionManager = new ThreadLocalUserSession();
    sessionManager.showBug();
  }
}

class UserSessionImpl implements UserSession {
  private String userId;

  public UserSessionImpl(String userId) {
    this.userId = userId;
  }

  @Override
  public String getUserId() {
    return userId;
  }
}

interface UserSession {
  String getUserId();
}

class UnauthorizedException extends RuntimeException {
  public UnauthorizedException(String message) {
    super(message);
  }
}