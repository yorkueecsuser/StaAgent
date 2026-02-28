class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) return true;
    System.exit(1);
    return false;

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}