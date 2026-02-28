class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Introduced mutant with an unreachable if-else statement
  static void mutantMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      // This branch is unreachable because shouldRun is always false
      System.out.println("This will never run.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else branch is unreachable
  }
}