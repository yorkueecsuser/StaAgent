class ShortCirtcuitEvaluation {

  static boolean hasEvenHashCode(Object x) {
    // Original code
    if (x!= null & x.hashCode() % 2 == 0) return true;
    return false;

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  // Method to provide a dynamic condition for the for loop
  private static boolean getCondition() {
    return false;
  }
}