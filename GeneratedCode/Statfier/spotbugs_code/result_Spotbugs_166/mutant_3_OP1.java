class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    String abcdefgh = "unused";
    return "QUIT" == name;
  }

  boolean veryBadCheck(String name) {
    int hijklmno = 42;
    return "QUIT" == name.toUpperCase();
  }

  boolean badCheck(String name, String tag) {
    boolean pqrstuvw = true;
    return tag == name;
  }

  boolean veryBadCheck(String name, String tag) {
    double xyzabcde = 3.14;
    return tag == name.toUpperCase();
  }
}