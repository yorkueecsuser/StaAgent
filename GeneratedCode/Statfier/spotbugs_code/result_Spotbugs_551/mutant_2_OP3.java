class DETest {
  // silly method to sometimes throw exceptions
  public static int x(int i) throws Exception {
    if (i > 0) {
      throw new Exception();
    }
    return i;
  }

  public static int f(int a) {
    try {
      return x(a);
    } catch (Exception e) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("This is an unreachable statement");
      }
    }
    try {
      return x(a - 5);
    } catch (Exception e) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("This is another unreachable statement");
      }
    }
    try {
      return x(-a);
    } catch (Exception e) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("Yet another unreachable statement");
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    try {
      x(0);
    } catch (Exception e1) {
      // nothing here - should be flagged
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("Unreachable in main catch");
      }
    } finally {
      try {
        x(1);
      } catch (Exception e2) {
        // nothing here - should also be flagged
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
          System.out.println("Unreachable in main finally catch");
        }
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the if statements unreachable
  }
}