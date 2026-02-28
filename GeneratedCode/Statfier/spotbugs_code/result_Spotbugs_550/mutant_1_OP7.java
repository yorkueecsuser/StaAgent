import java.io.IOException;

class Bug2382440 {
  void foo(int x) {
    try {
      someCallthatMightThrowException(x);
    } catch (Exception e) {
      // Ignore, use default.
    }

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private String someCallthatMightThrowException(int x) throws IOException {
    if (x == 42) throw new IOException();
    return "Yes";
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}