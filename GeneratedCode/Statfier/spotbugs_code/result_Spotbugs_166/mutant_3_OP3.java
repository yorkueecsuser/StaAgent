class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return "QUIT" == name;
  }

  boolean veryBadCheck(String name) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return "QUIT" == name.toUpperCase();
  }

  boolean badCheck(String name, String tag) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return tag == name;
  }

  boolean veryBadCheck(String name, String tag) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    return tag == name.toUpperCase();
  }

  private boolean getCondition() {
    return false;
  }
}