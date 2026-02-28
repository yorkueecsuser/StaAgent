class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    if (x == null) return x.hashCode();
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      return -1;
    }
    return 42;
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      return -1;
    }
    return 42;
  }

  int g() {
    if (x!= null) return 42;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      return -1;
    }
    return x.hashCode();
  }

  int doNotReport() {
    if (x == null) x = new Object();
    return x.hashCode();
  }

  public static Object y;

  int f3() {
    // Like f, but with a static field
    if (y == null) {
      return y.hashCode();
    }
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      return -1;
    }
    return 42;
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the condition effectively unreachable
  }
}