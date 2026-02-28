class Ideas_2009_05_30 {

  int x;

  Ideas_2009_05_30 next;

  void copyInto(Ideas_2009_05_30 that) {
    that.x = that.x;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  static void copy(Ideas_2009_05_30 a, Ideas_2009_05_30 b) {
    a.x = a.x;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  static void messWith(Ideas_2009_05_30 a) {
    a.x = a.x;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  private static boolean getCondition() {
    return false;
  }
}