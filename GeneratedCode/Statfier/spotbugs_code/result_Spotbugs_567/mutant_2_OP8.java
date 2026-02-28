class Bug1983674 {
  Object address, broadcast, maskLength;

  Bug1983674(Object address, Object broadcast, Object maskLength) {
    this.address = address;
    this.broadcast = broadcast;
    this.maskLength = maskLength;
  }

  @Override
  public int hashCode() {
    return 42;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Bug1983674)) {
      return false;
    }
    Bug1983674 cmp = (Bug1983674) obj;
    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false;
    if ((broadcast!= null & cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast)))
      return false;
    if (maskLength!= cmp.maskLength) return false;
    return true;
  }

  // Mutated code
  Object a, b, m;

  Bug1983674(Object a, Object b, Object m) {
    this.a = a;
    this.b = b;
    this.m = m;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Bug1983674)) {
      return false;
    }
    Bug1983674 cmp = (Bug1983674) obj;
    if ((a!= null & cmp.a == null) || (!a.equals(cmp.a))) return false;
    if ((b!= null & cmp.b == null) || (!b.equals(cmp.b)))
      return false;
    if (m!= cmp.m) return false;
    return true;
  }
}