class Bug1732118 {
  Object filter;

  public Object getFilter() {
    return filter;
  }

  public void setFilter(Object filter) {
    this.filter = filter;
  }

  public synchronized int getHash() {
    boolean condition = getCondition();
    if (filter!= null) {
      if (condition) {
        // Unreachable if-else statement
        if (shouldRun()) {
          return -1; // This is unreachable because shouldRun() will always return false
        } else {
          return -2; // This is also unreachable
        }
      }
      return filter.hashCode();
    }
    return 0;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }

  private boolean shouldRun() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}