class Ideas_2010_06_30 {

  int x;

  @Override
  public boolean equals(Object o) {
    // Original code
    boolean isEqual = (o instanceof Ideas_2010_06_30) && x == ((Ideas_2010_06_30) o).x;

    // Mutated code with unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      isEqual = false;
    } else {
      // This block will always execute
      isEqual = isEqual;
    }

    return isEqual;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}