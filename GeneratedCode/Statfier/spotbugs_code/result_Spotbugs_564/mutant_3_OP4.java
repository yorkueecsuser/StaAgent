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

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block");
    }

    return true;
  }

  private boolean getCondition() {
    // This method returns false, making the if block unreachable
    return false;
  }
}