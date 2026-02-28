class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {}
    String qzjfnhxy; // Dead store
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);
    int mtkrplbv; // Dead store
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      linear(i);
    }
    boolean xwvfrtgy; // Dead store
  }
}