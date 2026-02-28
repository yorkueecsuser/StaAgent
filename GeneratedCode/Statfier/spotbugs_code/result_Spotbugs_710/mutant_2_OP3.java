class Bug1564367 {
  void f(Object x, Object y) {
    // Original code
    if (y == null) x = y;
    else System.out.println(x);

    // Inserted unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable statement");
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}