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
    
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is unreachable because shouldRun will always be false
    } else {
      // Alternative code that is also unreachable
    }
    
    return true;
  }

  public boolean equals2(Object obj) {
    if (!(obj instanceof Bug1983674a)) return false;

    Bug1983674a cmp = (Bug1983674a) obj;
    if ((address!= null && cmp.address == null) || (!address.equals(cmp.address))) return false;
    
    // Unreachable if-else statement
    boolean shouldRun2 = getCondition();
    if (shouldRun2) {
      // This block is unreachable because shouldRun2 will always be false
    } else {
      // Alternative code that is also unreachable
    }
    
    return true;
  }

  public boolean foo(Object x, Object y) {
    if ((x!= null & y == null) || (!x.equals(y))) return false;
    
    // Unreachable if-else statement
    boolean shouldRun3 = getCondition();
    if (shouldRun3) {
      // This block is unreachable because shouldRun3 will always be false
    } else {
      // Alternative code that is also unreachable
    }
    
    return true;
  }

  public boolean foo2(Object x, Object y) {
    if ((x!= null && y == null) || (!x.equals(y))) return false;
    
    // Unreachable if-else statement
    boolean shouldRun4 = getCondition();
    if (shouldRun4) {
      // This block is unreachable because shouldRun4 will always be false
    } else {
      // Alternative code that is also unreachable
    }
    
    return true;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else blocks unreachable
    return false;
  }
}