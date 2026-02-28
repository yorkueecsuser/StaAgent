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

  // Mutated code with renaming of variable 'filter' to 'a'
  Object a;

  public Object getA() {
    return a;
  }

  public void setA(Object a) {
    this.a = a;
  }

  public synchronized int getHashA() {
    if (a!= null) return a.hashCode();
    return 0;
  }
}