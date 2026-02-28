class Bug06628576a {
  Object address;

  Bug06628576a(Object address) {
    this.address = address;
  }

  @Override
  public int hashCode() {
    return 42;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Bug06628576a)) return false;

    Bug06628576a cmp = (Bug06628576a) obj;
    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false;
    return true;
  }

  // Mutated code
  Object b;

  Bug06628576a(Object b) {
    this.b = b;
  }

  @Override
  public boolean equals(Object x) {
    if (!(x instanceof Bug06628576a)) return false;

    Bug06628576a y = (Bug06628576a) x;
    if ((b!= null & y.b == null) || (!b.equals(y.b))) return false;
    return true;
  }
}