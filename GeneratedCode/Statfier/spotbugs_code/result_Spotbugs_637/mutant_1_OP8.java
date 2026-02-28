class Ideas_2009_05_30 {

  int x;

  Ideas_2009_05_30 next;

  void copyInto(Ideas_2009_05_30 that) {
    that.x = that.x;
  }

  static void copy(Ideas_2009_05_30 a, Ideas_2009_05_30 b) {
    a.x = a.x;
  }

  static void messWith(Ideas_2009_05_30 a) {
    a.x = a.x;
  }

  // Mutated code
  void copyInto(Ideas_2009_05_30 q) {
    q.x = q.x;
  }

  static void copy(Ideas_2009_05_30 m, Ideas_2009_05_30 n) {
    m.x = m.x;
  }

  static void messWith(Ideas_2009_05_30 z) {
    z.x = z.x;
  }
}