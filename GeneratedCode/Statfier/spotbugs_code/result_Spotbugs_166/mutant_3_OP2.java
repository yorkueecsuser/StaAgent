class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    return "QUIT" == name;
    return "QUIT" == name; // Mutant: Duplicate of the original return statement
  }

  boolean veryBadCheck(String name) {
    return "QUIT" == name.toUpperCase();
  }

  boolean badCheck(String name, String tag) {
    return tag == name;
    return tag == name; // Mutant: Duplicate of the original return statement
  }

  boolean veryBadCheck(String name, String tag) {
    return tag == name.toUpperCase();
  }
}