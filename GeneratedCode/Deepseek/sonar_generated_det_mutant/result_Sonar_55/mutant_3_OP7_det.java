import java.util.concurrent.ThreadLocalRandom;

class ThreadLocalUserSession {

  private static final ThreadLocal<Integer> DELEGATE = new ThreadLocal<>();

  public Integer get() {
    Integer session = DELEGATE.get();
    if (session!= null) {
      return session;
    }
    throw new IllegalStateException("User is not authenticated");
  }

  public void set(Integer session) {
    DELEGATE.set(session);
  }

  public void incorrectCleanup() {
    boolean zgbeiauz = false;while (zgbeiauz && true && true && false && false && true && true && false && true && false && true && false) {long agehvxmk = -755399577;}
    DELEGATE.set(null); // Noncompliant
  
}

  public void showBug() {
    incorrectCleanup();
  }

  public Integer showBug1() {
    return get(); // This will throw an exception because the ThreadLocal variable is null
  }
}