class IntTest {
  void intValue_linear(Integer mKBytesToSend) {
    for (int count = 0; count < mKBytesToSend; count++) {}
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable if-else statement
      if (unreachableCondition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  static Integer static_Integer;

  static void static_Integer_top() {
    for (int count = 0; count < static_Integer; count++) {}
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable if-else statement
      if (unreachableCondition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  static void valueOf_linear(int p) {
    Integer x = p; // call to valueOf
    for (int count = 0; count < x; count++) {}
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable if-else statement
      if (unreachableCondition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable if-else statement
      if (unreachableCondition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable if-else statement
      if (unreachableCondition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}