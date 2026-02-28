class Bug06628576a {
  Object address;

  Bug06628576a(Object address) {
    this.address = address;
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
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

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }
}