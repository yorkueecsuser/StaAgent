class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;

    // Introduced mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      // This branch is unreachable because getCondition() always returns false
      System.out.println("This branch is unreachable.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}