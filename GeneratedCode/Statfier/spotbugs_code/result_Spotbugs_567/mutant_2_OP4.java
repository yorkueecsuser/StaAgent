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
    
    // Unreachable if-else statement mutation
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code block
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code block
      System.out.println("This is also unreachable code.");
    }

    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false;
    if ((broadcast!= null & cmp.broadcast == null) || (!broadcast.equals(cmp.broadcast)))
      return false;
    if (maskLength!= cmp.maskLength) return false;
    return true;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}