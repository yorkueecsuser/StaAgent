class Bug1564367 {
  void f(Object x, Object y) {
    if (y == null) x = y;
    else System.out.println(x);

    // Mutant code: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}