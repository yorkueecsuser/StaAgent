class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    if (x == null) return x.hashCode();
    return 42;
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    return 42;
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  int g() {
    if (x!= null) return 42;
    return x.hashCode();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  int doNotReport() {
    if (x == null) x = new Object();
    return x.hashCode();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  public static Object y;

  int f3() {
    // Like f, but with a static field
    if (y == null) {
      return y.hashCode();
    }
    return 42;
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}