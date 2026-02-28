class InterproceduralAnalysisOfNonnullReturnValues {

  String f() {
    return "x";
  }

  int g() {
    String s = f();
    if (s == null) return s.hashCode();
    return 0;

    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable statement");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}