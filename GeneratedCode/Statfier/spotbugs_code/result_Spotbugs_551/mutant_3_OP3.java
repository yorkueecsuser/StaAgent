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
    }
    try {
      return x(a - 5);
    } catch (Exception e) {
    }
    try {
      return x(-a);
    } catch (Exception e) {
    }
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block");
    }
    return 0;
  }

  public static void main(String[] args) {
    try {
      x(0);
    } catch (Exception e1) {
      // nothing here - should be flagged
    } finally {
      try {
        x(1);
      } catch (Exception e2) {
        // nothing here - should also be flagged
      }
    }
    // Mutant: Inserting an unreachable if statement
    boolean conditionMain = getCondition();
    if (conditionMain) {
      // This block is unreachable because conditionMain is always false
      System.out.println("This is another unreachable block in main");
    }
  }

  // Helper method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}