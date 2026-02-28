class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return "QUIT" == name;
  }

  boolean veryBadCheck(String name) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return "QUIT" == name.toUpperCase();
  }

  boolean badCheck(String name, String tag) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return tag == name;
  }

  boolean veryBadCheck(String name, String tag) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return tag == name.toUpperCase();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}