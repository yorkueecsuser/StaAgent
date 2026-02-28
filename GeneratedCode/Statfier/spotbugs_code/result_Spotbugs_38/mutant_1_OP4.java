class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;

    // Introduced mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      // This is the unreachable branch
      System.out.println("This will never run because shouldRun is always false.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else branch is unreachable
  }
}