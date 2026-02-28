class Bug1995271 {

  public static int foo(int x, int y) {
    if (x < 5 || x < 5) throw new IllegalArgumentException("This is wrong");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return x + y;
  }

  public static int foo2(int x, int y) {
    if (x < 5 && x < 5) throw new IllegalArgumentException("This is wrong");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return x + y;
  }

  public static int foo3(int x, int y) {
    if (x < 5) if (x < 5) throw new IllegalArgumentException("This is wrong");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return x + y;
  }

  public static boolean foo4(int x, int y) {
    if (x == 3 || x!= 3 && y == 5) return true;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return false;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}