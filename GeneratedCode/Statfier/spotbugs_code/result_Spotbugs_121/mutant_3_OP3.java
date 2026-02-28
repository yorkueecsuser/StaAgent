class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    if (x == null) return x.hashCode();
    return 42;
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 99; // This line is unreachable
    }
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    return 42;
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 99; // This line is unreachable
    }
  }

  int g() {
    if (x!= null) return 42;
    return x.hashCode();
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 99; // This line is unreachable
    }
  }

  int doNotReport() {
    if (x == null) x = new Object();
    return x.hashCode();
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 99; // This line is unreachable
    }
  }

  public static Object y;

  int f3() {
    // Like f, but with a static field
    if (y == null) {
      return y.hashCode();
    }
    return 42;
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 99; // This line is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be further customized to return false dynamically
  }
}