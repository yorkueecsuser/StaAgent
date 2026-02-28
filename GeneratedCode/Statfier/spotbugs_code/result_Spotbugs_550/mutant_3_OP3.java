import java.io.IOException;

class Bug2382440 {
  void foo(int x) {
    try {
      someCallthatMightThrowException(x);
    } catch (Exception e) {
      // Ignore, use default.
    }
    
    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  private String someCallthatMightThrowException(int x) throws IOException {
    if (x == 42) throw new IOException();
    return "Yes";
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}