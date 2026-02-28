class Bug1908621 {
  public static Boolean get_bool() {
    Boolean test;

    if (1 == (int) Math.round(Math.random())) {
      test = null;
    } else {
      test = true;
    }

    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      test = false; // This branch is unreachable because condition is always false
    } else {
      test = true;  // This branch is also unreachable because condition is always false
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

    // Inserting an unreachable if-else branch
    boolean condition2 = getCondition();
    if (condition2) {
      test2 = false; // This branch is unreachable because condition2 is always false
    } else {
      test2 = true;  // This branch is also unreachable because condition2 is always false
    }
    // END: get_bool()

    if (test2) {
      System.out.println("TRUE");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}