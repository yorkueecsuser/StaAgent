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
  }

  // Mutated code
  Object x;

  public Object getx() {
    return x;
  }

  public void setx(Object x) {
    this.x = x;
  }

  public synchronized int getHashx() {
    if (x!= null) return x.hashCode();
    return 0;
  }
}