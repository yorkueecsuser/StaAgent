class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    return "QUIT" == name;
    // Mutant addition
    String hgfjklpq = "unused";
  }

  boolean veryBadCheck(String name) {
    return "QUIT" == name.toUpperCase();
    // Mutant addition
    int wxyzabcd = 42;
  }

  boolean badCheck(String name, String tag) {
    return tag == name;
    // Mutant addition
    boolean rstuvwxy = true;
  }

  boolean veryBadCheck(String name, String tag) {
    return tag == name.toUpperCase();
    // Mutant addition
    double mnopqrst = 3.14;
  }
}