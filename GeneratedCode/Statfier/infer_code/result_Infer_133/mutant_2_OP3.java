class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Added mutant code based on the Unreachable if statement mutation operator
  static boolean getCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }

  static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This will never be printed.");
    }
  }
}