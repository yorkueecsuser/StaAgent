class Ideas_2011_07_26 {

  Boolean foo(int x) {
    if (x > 0) return true;
    if (x < 0) return false;
    return null;
  }

  void f(int x) {
    if (foo(x)) System.out.println("Foo");

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the else block is theoretically unreachable
  }
}