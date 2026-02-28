class ExclusiveTest {

  void linear(int x) {
    int i = 0;
    do {} while (i++ < x);
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);
  }

  void call_linear_exclusive_linear(int x) {
    int i = 0;
    do {
      linear(i);
    } while (++i < x);
  }
}