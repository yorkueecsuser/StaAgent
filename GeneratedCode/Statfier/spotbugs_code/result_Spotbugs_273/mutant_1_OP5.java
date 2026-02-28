class Bug3458406 {

  @edu.umd.cs.findbugs.annotations.SuppressWarnings(
      value = "DM_STRING_CTOR",
      justification = "A unique copy of the String is needed.")
  private static final Object s_empty = new String("EMPTY"); // Guarantee a unique copy

  @edu.umd.cs.findbugs.annotations.SuppressWarnings(
      value = "DM_STRING_CTOR",
      justification = "A unique copy of the String is needed.")
  private static final Object s_read = new String("READ"); // Guarantee a unique copy

  private static final Object s_empty2 = makeUniqueStringObject("EMPTY");
  private static final Object s_read2 = makeUniqueStringObject("EMPTY");

  @edu.umd.cs.findbugs.annotations.SuppressWarnings(
      value = "DM_STRING_CTOR",
      justification = "A unique copy of the String is needed.")
  private static String makeUniqueStringObject(String s) {
    return new String(s);
  }

  // Introduced unreachable switch statement
  private static void someMethod() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This will never be printed");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("This will always be printed");
        break;
    }
  }

  private static boolean getCondition() {
    // This method returns a constant false, but the switch condition is constructed to avoid compile-time determination
    return false;
  }
}