class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) return true;
    System.exit(1);
    return false;

    // Introduced unreachable if statement as per mutation operator
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}