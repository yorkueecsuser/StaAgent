import java.io.IOException;

class Bug2382440 {
  void foo(int x) {
    try {
      someCallthatMightThrowException(x);
    } catch (Exception e) {
      // Ignore, use default.
    }
  }

  private String someCallthatMightThrowException(int x) throws IOException {
    if (x == 42) throw new IOException();
    return "Yes";
  }

  // Mutated code
  void bar(int y) {
    try {
      someCallthatMightThrowException(y);
    } catch (Exception f) {
      // Ignore, use default.
    }
  }

  private String anotherMethod(int z) throws IOException {
    if (z == 42) throw new IOException();
    return "No";
  }
}