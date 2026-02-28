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
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
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
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
    return first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase());
  }

  private void methodThrowingBasicException() throws Exception {
    System.out.println("Method throwing Exception");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  private void methodThrowingIOException() throws IOException {
    System.out.println("Method throwing IOException");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  private void methodThrowingThrowable() throws Throwable {
    System.out.println("Method throwing Throwable");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
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
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  private void methodThatUsesSyntheticThatThrowsException() {
    acceptCallable(() -> "test2");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  private void methodThatUsesAnonymousThatImplementsMethodThatThrowsThrowable() {
    final ThrowThrowable runnable =
        new ThrowThrowable() {
          public void run() {}
        };

    acceptThrowingRunnable(runnable);
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  private void methodThatUsesSyntheticThatThrowsThrowable() {
    acceptThrowingRunnable(() -> {});
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  private void acceptCallable(Callable<String> callable) {
    try {
      System.out.println(callable.call());
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  private void acceptThrowingRunnable(ThrowThrowable runnable) {
    try {
      runnable.run();
    } catch (Throwable e) {
      System.err.println(e.getMessage());
    }
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable");
    }
  }

  @FunctionalInterface
  interface ThrowThrowable {
    void run() throws Throwable;
  }

  // Method to provide a dynamic condition for unreachable blocks
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}