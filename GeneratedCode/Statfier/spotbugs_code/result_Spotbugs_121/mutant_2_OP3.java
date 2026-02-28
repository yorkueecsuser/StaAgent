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
      return 99; // This will never be reached
    }
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    return 42;
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 98; // This will never be reached
    }
  }

  int g() {
    if (x!= null) return 42;
    return x.hashCode();
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 97; // This will never be reached
    }
  }

  int doNotReport() {
    if (x == null) x = new Object();
    return x.hashCode();
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 96; // This will never be reached
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
      return 95; // This will never be reached
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be further modified to return true under certain conditions if needed
  }
}