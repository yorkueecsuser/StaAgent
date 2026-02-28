class Bug1908621 {
  public static Boolean get_bool() {
    Boolean test;

    if (1 == (int) Math.round(Math.random())) {
      test = null;
    } else {
      test = true;
    }

    // Introduced unreachable switch statement
    boolean condition = false; // This will ensure the switch is unreachable
    switch (getValue()) {
      case 1:
        test = false; // This case will never be executed
        break;
      default:
        test = true; // This default case will also never be executed
        break;
    }

    return test;
  }

  /*
   * Both alternatives do exactly the same. Alternative 1 gets the possible
   * Null-Pointer-Dereference from the method "get_bool()", Alternative 2 gets
   * the possible Null-Pointer-Dereference directly in the same method.
   * FindBugs sends the alert only in alternative 2. It should also send the
   * alert in alternative 1.
   */

  public static void main(String[] args) {
    /** Alternative 1: Doesn't create a Null-Pointer-Dereference alert */
    Boolean test = get_bool();

    if (test) {
      System.out.println("TRUE");
    }

    /** Alternative 2: Creates a Null-Pointer-Dereference alert */

    // BEGIN: get_bool()
    Boolean test2;

    if (1 == (int) Math.round(Math.random())) {
      test2 = null;
    } else {
      test2 = true;
    }
    // END: get_bool()

    if (test2) {
      System.out.println("TRUE");
    }

    // Introduced unreachable switch statement
    boolean condition = false; // This will ensure the switch is unreachable
    switch (getValue()) {
      case 1:
        test2 = false; // This case will never be executed
        break;
      default:
        test2 = true; // This default case will also never be executed
        break;
    }
  }

  // Method to provide a dynamic value for switch statement
  private static int getValue() {
    return 0; // Always returns 0, ensuring switch is unreachable
  }
}