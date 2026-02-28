class InterproceduralAnalysisOfNonnullReturnValues {

  String f() {
    return "x";
  }

  int g() {
    String s = f();
    if (s == null) return s.hashCode();
    return 0;

    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // This block is also intended to be unreachable
      System.out.println("This should never be printed either");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}