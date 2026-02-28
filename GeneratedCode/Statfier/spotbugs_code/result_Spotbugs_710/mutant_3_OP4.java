class Bug1564367 {
  void f(Object x, Object y) {
    if (y == null) x = y;
    else System.out.println(x);

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}