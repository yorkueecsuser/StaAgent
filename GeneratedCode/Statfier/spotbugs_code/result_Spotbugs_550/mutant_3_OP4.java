import java.io.IOException;

class Bug2382440 {
  void foo(int x) {
    try {
      someCallthatMightThrowException(x);
    } catch (Exception e) {
      // Ignore, use default.
    }

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never be printed because shouldRun is always false.");
    } else {
      System.out.println("This will also never be printed because shouldRun is always false.");
    }
  }

  private String someCallthatMightThrowException(int x) throws IOException {
    if (x == 42) throw new IOException();
    return "Yes";
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}