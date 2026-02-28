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
  Object b;

  public Object getB() {
    return b;
  }

  public void setB(Object b) {
    this.b = b;
  }

  public synchronized int getHashMutant() {
    if (b!= null) return b.hashCode();
    return 0;
  }
}