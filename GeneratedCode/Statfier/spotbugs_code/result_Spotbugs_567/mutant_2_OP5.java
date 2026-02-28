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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is never true
        System.out.println("This will never be printed");
        break;
    }

    return true;
  }

  private boolean getCondition() {
    return false;
  }
}