import java.io.IOException;

class Bug2382440 {
  void foo(int x) {
    try {
      someCallthatMightThrowException(x);
    } catch (Exception e) {
      // Ignore, use default.
    }
  }

  private String someCallthatMightThrowException(int y) throws IOException {
    if (y == 42) throw new IOException();
    return "Yes";
  }
}