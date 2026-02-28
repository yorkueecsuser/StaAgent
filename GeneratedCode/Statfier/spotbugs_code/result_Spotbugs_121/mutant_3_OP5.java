class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    if (x == null) return x.hashCode();
    return 42;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 10;
        break;
      default:
        // Default case is also unreachable
        unreachableVar = 20;
        break;
    }
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    return 42;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 10;
        break;
      default:
        // Default case is also unreachable
        unreachableVar = 20;
        break;
    }
  }

  int g() {
    if (x!= null) return 42;
    return x.hashCode();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 10;
        break;
      default:
        // Default case is also unreachable
        unreachableVar = 20;
        break;
    }
  }

  int doNotReport() {
    if (x == null) x = new Object();
    return x.hashCode();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 10;
        break;
      default:
        // Default case is also unreachable
        unreachableVar = 20;
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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 10;
        break;
      default:
        // Default case is also unreachable
        unreachableVar = 20;
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}