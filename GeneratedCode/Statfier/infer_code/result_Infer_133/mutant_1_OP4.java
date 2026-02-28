class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Mutant code starts here
  static boolean getCondition() {
    return false;
  }

  static void mutantMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block.");
    }
  }
}