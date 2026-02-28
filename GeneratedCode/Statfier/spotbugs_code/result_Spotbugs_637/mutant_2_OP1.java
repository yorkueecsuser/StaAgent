class Ideas_2009_05_30 {

  int x;

  Ideas_2009_05_30 next;

  void copyInto(Ideas_2009_05_30 that) {
    that.x = that.x;
    // Dead store mutation
    String qzjfnrht = "unusedVariable";
  }

  static void copy(Ideas_2009_05_30 a, Ideas_2009_05_30 b) {
    a.x = a.x;
    // Dead store mutation
    int vbnrhtyu = 42;
  }

  static void messWith(Ideas_2009_05_30 a) {
    a.x = a.x;
    // Dead store mutation
    boolean wxyzabcd = true;
  }
}