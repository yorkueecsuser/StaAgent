class Bug1732118 {
  Object filter;

  public Object getFilter() {
    return filter;
  }

  public void setFilter(Object filter) {
    this.filter = filter;
  }

  public synchronized int getHash() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
    if (filter!= null) return filter.hashCode();
    return 0;
  }

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}