class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Mutant code added below
  static boolean getCondition() {
    return false;
  }

  static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This will never be printed.");
    }
  }
}