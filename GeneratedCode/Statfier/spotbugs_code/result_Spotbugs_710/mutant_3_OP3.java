class Bug1564367 {
  void f(Object x, Object y) {
    if (y == null) x = y;
    else System.out.println(x);

    // Mutant code: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}