import java.io.IOException;

class Bug2382440 {
  void foo(int x) {
    try {
      someCallthatMightThrowException(x);
      String qzjfnbvt = "unused"; // Dead store mutation
    } catch (Exception e) {
      // Ignore, use default.
    }
  }

  private String someCallthatMightThrowException(int x) throws IOException {
    if (x == 42) throw new IOException();
    return "Yes";
  }
}