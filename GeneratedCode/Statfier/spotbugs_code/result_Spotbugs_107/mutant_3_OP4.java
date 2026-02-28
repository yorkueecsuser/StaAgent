class ShortCirtcuitEvaluation {

  static boolean hasEvenHashCode(Object x) {
    if (x!= null & x.hashCode() % 2 == 0) return true;
    return false;

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // This block is also intended to be unreachable
      System.out.println("This should never be printed either");
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}