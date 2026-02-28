class Bug1995271 {

  public static int foo(int x, int y) {
    if (x < 5 || x < 5) throw new IllegalArgumentException("This is wrong");
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return x + y;
  }

  public static int foo2(int x, int y) {
    if (x < 5 && x < 5) throw new IllegalArgumentException("This is wrong");
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return x + y;
  }

  public static int foo3(int x, int y) {
    if (x < 5) if (x < 5) throw new IllegalArgumentException("This is wrong");
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return x + y;
  }

  public static boolean foo4(int x, int y) {
    if (x == 3 || x!= 3 && y == 5) return true;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return false;
  }

  // Method to provide a dynamic condition for unreachable if branches
  private static boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}