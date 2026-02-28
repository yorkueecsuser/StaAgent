class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    return "QUIT" == name;
  }

  boolean veryBadCheck(String name) {
    return "QUIT" == name.toUpperCase();
  }

  boolean badCheck(String name, String tag) {
    return tag == name;
  }

  boolean veryBadCheck(String name, String tag) {
    return tag == name.toUpperCase();
  }

  // Mutated methods
  boolean badCheck(String x, String y) {
    return y == x;
  }

  boolean veryBadCheck(String n, String t) {
    return t == n.toUpperCase();
  }
}