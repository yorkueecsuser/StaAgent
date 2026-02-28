// _SHOULD_BE_SKIPPED_

class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Introduced unreachable for loop according to the mutation operator
  static boolean getCondition() {
    return false;
  }

  static void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
      System.out.println("This will never be printed.");
    }
  }
}