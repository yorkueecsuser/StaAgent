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
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
    return true;
  }

  public boolean equals2(Object obj) {
    if (!(obj instanceof Bug1983674a)) return false;

    Bug1983674a cmp = (Bug1983674a) obj;
    if ((address!= null && cmp.address == null) || (!address.equals(cmp.address))) return false;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed in equals2");
    } else {
      System.out.println("This will also never be printed in equals2");
    }
    return true;
  }

  public boolean foo(Object x, Object y) {
    if ((x!= null & y == null) || (!x.equals(y))) return false;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed in foo");
    } else {
      System.out.println("This will also never be printed in foo");
    }
    return true;
  }

  public boolean foo2(Object x, Object y) {
    if ((x!= null && y == null) || (!x.equals(y))) return false;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed in foo2");
    } else {
      System.out.println("This will also never be printed in foo2");
    }
    return true;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}