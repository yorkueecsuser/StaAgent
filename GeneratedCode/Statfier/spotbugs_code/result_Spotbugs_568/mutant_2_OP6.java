class Bug1983674a {
  Object address;

  Bug1983674a(Object address) {
    this.address = address;
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }

  @Override
  public int hashCode() {
    return 42;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Bug1983674a)) return false;

    Bug1983674a cmp = (Bug1983674a) obj;
    if ((address!= null & cmp.address == null) || (!address.equals(cmp.address))) return false;
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return true;
  }

  public boolean equals2(Object obj) {
    if (!(obj instanceof Bug1983674a)) return false;

    Bug1983674a cmp = (Bug1983674a) obj;
    if ((address!= null && cmp.address == null) || (!address.equals(cmp.address))) return false;
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return true;
  }

  public boolean foo(Object x, Object y) {
    if ((x!= null & y == null) || (!x.equals(y))) return false;
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return true;
  }

  public boolean foo2(Object x, Object y) {
    if ((x!= null && y == null) || (!x.equals(y))) return false;
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return true;
  }
}