class Bug06628576 {
  Object address, broadcast, maskLength;

  Bug06628576(Object address, Object broadcast, Object maskLength) {
    this.address = address;
    this.address = address; // Duplicate assignment
    this.broadcast = broadcast;
    this.broadcast = broadcast; // Duplicate assignment
    this.maskLength = maskLength;
    this.maskLength = maskLength; // Duplicate assignment
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
}