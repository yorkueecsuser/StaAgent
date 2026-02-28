class Bug1908621 {
  public static Boolean get_bool() {
    Boolean test;

    if (1 == (int) Math.round(Math.random())) {
      test = null;
    } else {
      test = true;
    }

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
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

    // Introduced unreachable while loop
    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // This loop is unreachable because getCondition() always returns false
    }

    if (test2) {
      System.out.println("TRUE");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}