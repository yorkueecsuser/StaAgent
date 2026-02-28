class InterproceduralAnalysisOfNonnullReturnValues {

  String f() {
    return "x";
  }

  int g() {
    String s = f();
    if (s == null) return s.hashCode();
    return 0;

    // Mutated code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is logically unreachable because shouldRun is never set to true
      System.out.println("This is an unreachable if block");
    } else {
      // This block is also logically unreachable for the same reason
      System.out.println("This is an unreachable else block");
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if-else block is unreachable
    return false;
  }
}