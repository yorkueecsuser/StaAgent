class Ideas_2009_05_30 {

  int x;

  Ideas_2009_05_30 next;

  void copyInto(Ideas_2009_05_30 that) {
    that.x = that.x;
    // Dead Store Mutation
    String jhgfdsaz = "unused";
  }

  static void copy(Ideas_2009_05_30 a, Ideas_2009_05_30 b) {
    a.x = a.x;
    // Dead Store Mutation
    int qwerasdf = 42;
  }

  static void messWith(Ideas_2009_05_30 a) {
    a.x = a.x;
    // Dead Store Mutation
    boolean zxcvbnml = true;
  }
}