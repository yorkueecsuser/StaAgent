class Ideas_2011_07_26 {

  Boolean foo(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    if (x > 0) return true;
    if (x < 0) return false;
    return null;
  }

  void f(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    if (foo(x)) System.out.println("Foo");
  }

  private boolean getCondition() {
    return false;
  }
}