class Ideas_2009_05_30 {

  int x;

  Ideas_2009_05_30 next;

  void copyInto(Ideas_2009_05_30 that) {
    that.x = that.x;
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        that.x = 0; // This will never be executed
        break;
    }
  }

  static void copy(Ideas_2009_05_30 a, Ideas_2009_05_30 b) {
    a.x = a.x;
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        a.x = 0; // This will never be executed
        break;
    }
  }

  static void messWith(Ideas_2009_05_30 a) {
    a.x = a.x;
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        a.x = 0; // This will never be executed
        break;
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}