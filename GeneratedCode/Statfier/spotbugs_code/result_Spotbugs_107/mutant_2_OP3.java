class ShortCirtcuitEvaluation {

  static boolean hasEvenHashCode(Object x) {
    if (x!= null & x.hashCode() % 2 == 0) return true;
    
    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable branch");
    }
    
    return false;
  }

  private static boolean getUnreachableCondition() {
    return false; // This method always returns false, making the condition effectively unreachable
  }
}