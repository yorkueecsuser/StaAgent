class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) return true;
    System.exit(1);
    return false;

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true in this context
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}