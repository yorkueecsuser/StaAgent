import java.io.IOException;

class Bug2382440 {
  void foo(int x) {
    try {
      someCallthatMightThrowException(x);
    } catch (Exception e) {
      // Ignore, use default.
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }
    }
  }

  private String someCallthatMightThrowException(int x) throws IOException {
    if (x == 42) throw new IOException();
    return "Yes";
  }

  private boolean getConditionForLoop() {
    return false;
  }
}