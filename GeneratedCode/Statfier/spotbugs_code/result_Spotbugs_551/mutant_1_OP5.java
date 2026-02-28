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
    // Inserting unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
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
    // Inserting unreachable switch statement
    boolean alwaysFalseMain = getCondition();
    switch (alwaysFalseMain) {
      case true:
        System.out.println("This will never be printed in main");
        break;
    }
  }

  // Helper method to ensure dynamic determination
  private static boolean getCondition() {
    return false;
  }
}