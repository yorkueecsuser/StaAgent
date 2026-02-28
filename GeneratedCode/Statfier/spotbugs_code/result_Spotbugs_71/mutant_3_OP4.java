class Bug1871051 {
  @Override
  public Object clone() {
    // Original code
    return new Bug1871051();

    // Added mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is always false
    }
  }

  private boolean getCondition() {
    return false;
  }
}