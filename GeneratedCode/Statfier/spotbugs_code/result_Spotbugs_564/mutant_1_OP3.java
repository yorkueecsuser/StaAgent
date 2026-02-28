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
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false;
    return true;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if block unreachable
  }
}