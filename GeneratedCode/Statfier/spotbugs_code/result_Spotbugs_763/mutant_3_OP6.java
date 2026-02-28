class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }

    if (o instanceof CallSystemExit) return true;
    System.exit(1);
    return false;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}