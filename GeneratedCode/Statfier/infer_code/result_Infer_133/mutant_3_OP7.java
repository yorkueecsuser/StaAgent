// _SHOULD_BE_SKIPPED_

class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Introduced an unreachable while loop according to the mutation operator
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