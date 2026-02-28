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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase());
  }

  private void methodThrowingBasicException() throws Exception {
    System.out.println("Method throwing Exception");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void methodThrowingIOException() throws IOException {
    System.out.println("Method throwing IOException");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void methodThrowingThrowable() throws Throwable {
    System.out.println("Method throwing Throwable");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void methodThatUsesAnonymousThatImplementsMethodThatThrowsException() {
    final Callable<String> callable =
        new Callable<String>() {
          public String call() {
            return "test";
          }
        };

    acceptCallable(callable);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void methodThatUsesSyntheticThatThrowsException() {
    acceptCallable(() -> "test2");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void methodThatUsesAnonymousThatImplementsMethodThatThrowsThrowable() {
    final ThrowThrowable runnable =
        new ThrowThrowable() {
          public void run() {}
        };

    acceptThrowingRunnable(runnable);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void methodThatUsesSyntheticThatThrowsThrowable() {
    acceptThrowingRunnable(() -> {});
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void acceptCallable(Callable<String> callable) {
    try {
      System.out.println(callable.call());
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void acceptThrowingRunnable(ThrowThrowable runnable) {
    try {
      runnable.run();
    } catch (Throwable e) {
      System.err.println(e.getMessage());
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @FunctionalInterface
  interface ThrowThrowable {
    void run() throws Throwable;
  }

  private boolean getCondition() {
    return false;
  }
}