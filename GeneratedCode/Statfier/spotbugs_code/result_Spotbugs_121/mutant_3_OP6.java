class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // Unreachable code
    }
    if (x == null) return x.hashCode();
    return 42;
  }

  int f2() {
    Object tmp = x;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // Unreachable code
    }
    if (tmp == null) return x.hashCode();
    return 42;
  }

  int g() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // Unreachable code
    }
    if (x!= null) return 42;
    return x.hashCode();
  }

  int doNotReport() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // Unreachable code
    }
    if (x == null) x = new Object();
    return x.hashCode();
  }

  public static Object y;

  int f3() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // Unreachable code
    }
    // Like f, but with a static field
    if (y == null) {
      return y.hashCode();
    }
    return 42;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}