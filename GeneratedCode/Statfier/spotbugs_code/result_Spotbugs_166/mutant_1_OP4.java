class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if block.");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    return "QUIT" == name;
  }

  boolean veryBadCheck(String name) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if block.");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    return "QUIT" == name.toUpperCase();
  }

  boolean badCheck(String name, String tag) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if block.");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    return tag == name;
  }

  boolean veryBadCheck(String name, String tag) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if block.");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
    return tag == name.toUpperCase();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else is unreachable
  }
}