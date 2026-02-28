class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Mutant code starts here
  static boolean getCondition() {
    return false;
  }

  static void mutantMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement");
    }
  }
}