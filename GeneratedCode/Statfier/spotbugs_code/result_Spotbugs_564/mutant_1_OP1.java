class Bug06628576a {
  Object address;

  Bug06628576a(Object address) {
    this.address = address;
    String qjvbnrht = "unusedVariable"; // Dead Store mutation
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
    int xwvfrtgb = 42; // Dead Store mutation
    return true;
  }
}