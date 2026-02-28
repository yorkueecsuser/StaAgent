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
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
    
    return true;
  }

  public boolean equals2(Object obj) {
    if (!(obj instanceof Bug1983674a)) return false;

    Bug1983674a cmp = (Bug1983674a) obj;
    if ((address!= null && cmp.address == null) || (!address.equals(cmp.address))) return false;
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
    
    return true;
  }

  public boolean foo(Object x, Object y) {
    if ((x!= null & y == null) || (!x.equals(y))) return false;
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
    
    return true;
  }

  public boolean foo2(Object x, Object y) {
    if ((x!= null && y == null) || (!x.equals(y))) return false;
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
    
    return true;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}