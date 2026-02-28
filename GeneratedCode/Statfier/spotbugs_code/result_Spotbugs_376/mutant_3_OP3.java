class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    // Original code
    return false;

    // Added mutant code
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement");
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if statement is unreachable
    return false;
  }
}