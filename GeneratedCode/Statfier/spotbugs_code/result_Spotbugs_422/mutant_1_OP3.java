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

    // Introduced unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      filter = new Object();
    }
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}