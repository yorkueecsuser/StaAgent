class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    if (x == null) return x.hashCode();
    return 42;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Also unreachable code
      System.out.println("This is also unreachable");
    }
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    return 42;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Also unreachable code
      System.out.println("This is also unreachable");
    }
  }

  int g() {
    if (x!= null) return 42;
    return x.hashCode();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Also unreachable code
      System.out.println("This is also unreachable");
    }
  }

  int doNotReport() {
    if (x == null) x = new Object();
    return x.hashCode();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Also unreachable code
      System.out.println("This is also unreachable");
    }
  }

  public static Object y;

  int f3() {
    // Like f, but with a static field
    if (y == null) {
      return y.hashCode();
    }
    return 42;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Also unreachable code
      System.out.println("This is also unreachable");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be further modified to return a dynamic condition if needed
  }
}