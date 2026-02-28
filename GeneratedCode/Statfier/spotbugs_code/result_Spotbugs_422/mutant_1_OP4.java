class Bug1732118 {
  Object filter;

  public Object getFilter() {
    return filter;
  }

  public void setFilter(Object filter) {
    this.filter = filter;
  }

  public synchronized int getHash() {
    if (filter!= null) return filter.hashCode();
    return 0;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is unreachable because shouldRun is always false
      return -1;
    } else {
      // This block is also unreachable because shouldRun is always false
      return -2;
    }
  }

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}