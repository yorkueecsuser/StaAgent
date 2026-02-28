class Bug06628576 {
  Object address, broadcast, maskLength;

  Bug06628576(Object address, Object broadcast, Object maskLength) {
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
    if (!(obj instanceof Bug06628576)) {
      return false;
    }
    Bug06628576 cmp = (Bug06628576) obj;
    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false;
    if ((broadcast!= null & cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast)))
      return false;
    if (maskLength!= cmp.maskLength) return false;
    return true;
  }

  // Mutated code
  Object z, y, x;

  Bug06628576(Object z, Object y, Object x) {
    this.z = z;
    this.y = y;
    this.x = x;
  }

  @Override
  public boolean equals(Object q) {
    if (!(q instanceof Bug06628576)) {
      return false;
    }
    Bug06628576 r = (Bug06628576) q;
    if ((z!= null & r.z == null) || (!z.equals(r.z))) return false;
    if ((y!= null & r.y == null) || (!y.equals(r.y)))
      return false;
    if (x!= r.x) return false;
    return true;
  }
}