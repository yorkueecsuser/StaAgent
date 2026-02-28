class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {}
    String qzjxflrt = "unused"; // Dead store
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);
    int wvbnrhty = 42; // Dead store
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      linear(i);
      boolean fghjklmn = true; // Dead store
    }
  }
}