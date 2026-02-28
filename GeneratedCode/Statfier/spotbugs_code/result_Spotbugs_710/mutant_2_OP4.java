class Bug1564367 {
  void f(Object x, Object y) {
    if (y == null) x = y;
    else System.out.println(x);

    // Mutant code: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable for the same reason
      System.out.println("This is another unreachable block");
    }
  }

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }
}