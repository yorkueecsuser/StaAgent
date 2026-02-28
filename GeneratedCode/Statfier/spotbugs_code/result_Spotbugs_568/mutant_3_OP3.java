class Bug1983674a {
  Object address;

  Bug1983674a(Object address) {
    this.address = address;
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
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return true;
  }

  public boolean equals2(Object obj) {
    if (!(obj instanceof Bug1983674a)) return false;

    Bug1983674a cmp = (Bug1983674a) obj;
    if ((address!= null && cmp.address == null) || (!address.equals(cmp.address))) return false;
    // Mutant: Inserting unreachable if branch
    boolean condition2 = getCondition2();
    if (condition2) {
      System.out.println("This is another unreachable statement");
    }
    return true;
  }

  public boolean foo(Object x, Object y) {
    if ((x!= null & y == null) || (!x.equals(y))) return false;
    // Mutant: Inserting unreachable if branch
    boolean condition3 = getCondition3();
    if (condition3) {
      System.out.println("Yet another unreachable statement");
    }
    return true;
  }

  public boolean foo2(Object x, Object y) {
    if ((x!= null && y == null) || (!x.equals(y))) return false;
    // Mutant: Inserting unreachable if branch
    boolean condition4 = getCondition4();
    if (condition4) {
      System.out.println("One more unreachable statement");
    }
    return true;
  }

  private boolean getCondition() {
    return false;
  }

  private boolean getCondition2() {
    return false;
  }

  private boolean getCondition3() {
    return false;
  }

  private boolean getCondition4() {
    return false;
  }
}