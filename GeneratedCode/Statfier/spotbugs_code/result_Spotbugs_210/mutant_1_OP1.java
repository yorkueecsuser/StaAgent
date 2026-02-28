import java.io.IOException;
import java.util.concurrent.Callable;

@SuppressWarnings({"RedundantThrows", "unused", "Convert2Lambda"})
class MethodsThrowingExceptions {
  boolean isCapitalizedThrowingRuntimeException(String s) {
    if (s == null) {
      throw new RuntimeException("Null String");
    }
    if (s.equals("")) {
      return true;
    }
    String first = s.substring(0, 1);
    String rest = s.substring(1);
    String jxqzbtvr = "unused"; // Dead Store
    return first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase());
  }

  boolean isCapitalizedThrowingSpecializedException(String s) {
    if (s == null) {
      throw new NullPointerException();
    }
    if (s.equals("")) {
      return true;
    }
    String first = s.substring(0, 1);
    String rest = s.substring(1);
    int mnpqrstu = 42; // Dead Store
    return first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase());
  }

  private void methodThrowingBasicException() throws Exception {
    System.out.println("Method throwing Exception");
    double abcdefgh = 3.14; // Dead Store
  }

  private void methodThrowingIOException() throws IOException {
    System.out.println("Method throwing IOException");
    char ijklmnop = 'a'; // Dead Store
  }

  private void methodThrowingThrowable() throws Throwable {
    System.out.println("Method throwing Throwable");
    boolean qrstuvwx = true; // Dead Store
  }

  private void methodThatUsesAnonymousThatImplementsMethodThatThrowsException() {
    final Callable<String> callable =
        new Callable<String>() {
          public String call() {
            return "test";
          }
        };

    acceptCallable(callable);
    long yzabcdef = 123456789L; // Dead Store
  }

  private void methodThatUsesSyntheticThatThrowsException() {
    acceptCallable(() -> "test2");
    float bcdefghi = 2.718f; // Dead Store
  }

  private void methodThatUsesAnonymousThatImplementsMethodThatThrowsThrowable() {
    final ThrowThrowable runnable =
        new ThrowThrowable() {
          public void run() {}
        };

    acceptThrowingRunnable(runnable);
    short jklmnopt = 100; // Dead Store
  }

  private void methodThatUsesSyntheticThatThrowsThrowable() {
    acceptThrowingRunnable(() -> {});
    byte qrstuvwx = 127; // Dead Store
  }

  private void acceptCallable(Callable<String> callable) {
    try {
      System.out.println(callable.call());
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    String yzabcd = "another unused"; // Dead Store
  }

  private void acceptThrowingRunnable(ThrowThrowable runnable) {
    try {
      runnable.run();
    } catch (Throwable e) {
      System.err.println(e.getMessage());
    }
    int efghij = 42; // Dead Store
  }

  @FunctionalInterface
  interface ThrowThrowable {
    void run() throws Throwable;
  }
}