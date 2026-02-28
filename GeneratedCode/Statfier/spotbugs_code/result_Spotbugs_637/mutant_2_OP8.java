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
  void copyIntoMutant(Ideas_2009_05_30 z) {
    z.x = z.x;
  }

  static void copyMutant(Ideas_2009_05_30 c, Ideas_2009_05_30 d) {
    c.x = c.x;
  }

  static void messWithMutant(Ideas_2009_05_30 e) {
    e.x = e.x;
  }
}