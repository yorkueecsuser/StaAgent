class Bug1871051 {
  @Override
  public Object clone() {
    // Original code
    return new Bug1871051();

    // Mutant code: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}