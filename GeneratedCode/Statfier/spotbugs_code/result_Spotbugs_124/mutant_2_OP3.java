class Bug1995271 {

  public static int foo(int x, int y) {
    if (x < 5 || x < 5) throw new IllegalArgumentException("This is wrong");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return x + y;
  }

  public static int foo2(int x, int y) {
    if (x < 5 && x < 5) throw new IllegalArgumentException("This is wrong");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return x + y;
  }

  public static int foo3(int x, int y) {
    if (x < 5) if (x < 5) throw new IllegalArgumentException("This is wrong");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return x + y;
  }

  public static boolean foo4(int x, int y) {
    if (x == 3 || x!= 3 && y == 5) return true;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return false;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}