class Bug1995271 {

  public static int foo(int x, int y) {
    if (x < 5 || x < 5) throw new IllegalArgumentException("This is wrong");
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
    return x + y;
  }

  public static int foo2(int x, int y) {
    if (x < 5 && x < 5) throw new IllegalArgumentException("This is wrong");
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
    return x + y;
  }

  public static int foo3(int x, int y) {
    if (x < 5) if (x < 5) throw new IllegalArgumentException("This is wrong");
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
    return x + y;
  }

  public static boolean foo4(int x, int y) {
    if (x == 3 || x!= 3 && y == 5) return true;
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
    return false;
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method can be modified to return different values at runtime
  }
}