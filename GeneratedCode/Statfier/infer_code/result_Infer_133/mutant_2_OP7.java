class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Introduced unreachable while loop as per mutation operator
  static boolean getCondition() {
    return false;
  }

  static void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This will never be printed");
    }
  }
}