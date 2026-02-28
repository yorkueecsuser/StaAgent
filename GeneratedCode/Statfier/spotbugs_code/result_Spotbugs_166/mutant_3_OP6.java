class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    return "QUIT" == name;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  boolean veryBadCheck(String name) {
    return "QUIT" == name.toUpperCase();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  boolean badCheck(String name, String tag) {
    return tag == name;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  boolean veryBadCheck(String name, String tag) {
    return tag == name.toUpperCase();
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}