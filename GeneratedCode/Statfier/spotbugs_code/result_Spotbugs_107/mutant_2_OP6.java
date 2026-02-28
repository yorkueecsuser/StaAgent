class ShortCirtcuitEvaluation {

  static boolean hasEvenHashCode(Object x) {
    if (x!= null & x.hashCode() % 2 == 0) return true;
    
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
    
    return false;
  }

  private static boolean getCondition() {
    return false;
  }
}