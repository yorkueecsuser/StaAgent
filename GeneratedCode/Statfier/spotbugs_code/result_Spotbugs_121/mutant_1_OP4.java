class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    if (x == null) return x.hashCode();
    return 42;
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      return 99;
    } else {
      return 100;
    }
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    return 42;
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      return 99;
    } else {
      return 100;
    }
  }

  int g() {
    if (x!= null) return 42;
    return x.hashCode();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      return 99;
    } else {
      return 100;
    }
  }

  int doNotReport() {
    if (x == null) x = new Object();
    return x.hashCode();
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      return 99;
    } else {
      return 100;
    }
  }

  public static Object y;

  int f3() {
    // Like f, but with a static field
    if (y == null) {
      return y.hashCode();
    }
    return 42;
    // Mutant: Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true
      return 99;
    } else {
      return 100;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true in a test scenario to make the branches reachable
  }
}