class Finalize {
  @Override
  protected void finalize() {
    // Original code left intact
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    }
    // Inserted unreachable if branch
    boolean unreachableCondition = isUnreachable();
    if (unreachableCondition) {
      // This block is unreachable because isUnreachable() always returns false
    }
  }

  private boolean getCondition() {
    // This method can return true or false based on some logic
    return false;
  }

  private boolean isUnreachable() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}