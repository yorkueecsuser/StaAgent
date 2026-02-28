import java.io.IOException;

class Bug2382440 {
  void foo(int x) {
    try {
      someCallthatMightThrowException(x);
    } catch (Exception e) {
      // Ignore, use default.
    }

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never be executed because condition is always false
      System.out.println("This is another unreachable block");
    }
  }

  private String someCallthatMightThrowException(int x) throws IOException {
    if (x == 42) throw new IOException();
    return "Yes";
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}