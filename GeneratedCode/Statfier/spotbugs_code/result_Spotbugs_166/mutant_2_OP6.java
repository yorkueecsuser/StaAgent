class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    return "QUIT" == name;
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  boolean veryBadCheck(String name) {
    return "QUIT" == name.toUpperCase();
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  boolean badCheck(String name, String tag) {
    return tag == name;
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  boolean veryBadCheck(String name, String tag) {
    return tag == name.toUpperCase();
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}