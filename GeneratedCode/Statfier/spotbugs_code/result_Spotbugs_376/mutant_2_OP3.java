class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    // Original code
    return false;

    // Mutant code: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  // Helper method to ensure the condition is dynamically determined
  private boolean getCondition() {
    return false;
  }
}