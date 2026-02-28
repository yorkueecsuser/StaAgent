class IdentifyCorrectBranchPlease {

  int f(boolean b) {
    Object x = null;
    if (b) {
      x = new Object();
    } else {
      b = true;
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
    return x.hashCode();
  }

  int f(boolean b1, boolean b2) {
    Object x = null;
    if (b1) {
      x = new Object();
    } else {
      b1 = true;
    }
    if (b2) System.out.println("b2 is true");
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
    return x.hashCode();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the loop unreachable
  }
}