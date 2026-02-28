class Ideas_2009_05_30 {

  int x;

  Ideas_2009_05_30 next;

  void copyInto(Ideas_2009_05_30 that) {
    that.x = that.x;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      that.x = 0;
    }
  }

  static void copy(Ideas_2009_05_30 a, Ideas_2009_05_30 b) {
    a.x = a.x;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      a.x = 0;
    }
  }

  static void messWith(Ideas_2009_05_30 a) {
    a.x = a.x;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      a.x = 0;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}