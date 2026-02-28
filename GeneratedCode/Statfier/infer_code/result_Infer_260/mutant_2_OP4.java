class IntTest {
  void intValue_linear(Integer mKBytesToSend) {
    for (int count = 0; count < mKBytesToSend; count++) {}
    // Unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is unreachable code.");
    } else {
      System.out.println("This is also unreachable code.");
    }
  }

  static Integer static_Integer;

  static void static_Integer_top() {
    for (int count = 0; count < static_Integer; count++) {}
    // Unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is unreachable code.");
    } else {
      System.out.println("This is also unreachable code.");
    }
  }

  static void valueOf_linear(int p) {
    Integer x = p; // call to valueOf
    for (int count = 0; count < x; count++) {}
    // Unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is unreachable code.");
    } else {
      System.out.println("This is also unreachable code.");
    }
  }

  boolean unknown_bool;

  void control_var_band_constant(int x, int y) {
    int z;
    for (int i = 0; i < 10; i++) {
      if (unknown_bool) {
        z = x & y;
      } else {
        z = x | y;
      }
      if (z == 0) {
        break;
      }
    }
    // Unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is unreachable code.");
    } else {
      System.out.println("This is also unreachable code.");
    }
  }

  void control_var_band_add_constant(int x, int y) {
    int z;
    for (int i = 0; i < 10; i++) {
      if (unknown_bool) {
        z = (x & y) + 1;
      } else {
        z = (x | y) + 1;
      }
      if (z == 0) {
        break;
      }
    }
    // Unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is unreachable code.");
    } else {
      System.out.println("This is also unreachable code.");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if-else branches unreachable
  }
}