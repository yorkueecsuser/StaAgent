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
    
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getCondition() {
    // This method will always return false, making the if block unreachable
    return false;
  }
}