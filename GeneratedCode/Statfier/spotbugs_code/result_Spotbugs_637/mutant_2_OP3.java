class Ideas_2009_05_30 {

  int x;

  Ideas_2009_05_30 next;

  void copyInto(Ideas_2009_05_30 that) {
    that.x = that.x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      that.x = 0;
    }
  }

  static void copy(Ideas_2009_05_30 a, Ideas_2009_05_30 b) {
    a.x = a.x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      a.x = 0;
    }
  }

  static void messWith(Ideas_2009_05_30 a) {
    a.x = a.x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      a.x = 0;
    }
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the if block unreachable
  }
}