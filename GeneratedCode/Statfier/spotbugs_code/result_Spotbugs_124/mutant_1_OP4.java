class Bug1995271 {

  public static int foo(int x, int y) {
    if (x < 5 || x < 5) throw new IllegalArgumentException("This is wrong");
    // Mutant: Adding unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      x = x + 1;
    } else {
      // This block is also unreachable because condition is always false
      y = y + 1;
    }
    return x + y;
  }

  public static int foo2(int x, int y) {
    if (x < 5 && x < 5) throw new IllegalArgumentException("This is wrong");
    // Mutant: Adding unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      x = x + 1;
    } else {
      // This block is also unreachable because condition is always false
      y = y + 1;
    }
    return x + y;
  }

  public static int foo3(int x, int y) {
    if (x < 5) if (x < 5) throw new IllegalArgumentException("This is wrong");
    // Mutant: Adding unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      x = x + 1;
    } else {
      // This block is also unreachable because condition is always false
      y = y + 1;
    }
    return x + y;
  }

  public static boolean foo4(int x, int y) {
    if (x == 3 || x!= 3 && y == 5) return true;
    // Mutant: Adding unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      return false;
    } else {
      // This block is also unreachable because condition is always false
      return true;
    }
    return false;
  }

  // Helper method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}