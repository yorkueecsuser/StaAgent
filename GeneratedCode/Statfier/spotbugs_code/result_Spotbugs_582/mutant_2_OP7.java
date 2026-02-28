class IdentifyCorrectBranchPlease {

  int f(boolean b) {
    Object x = null;
    if (b) {
      x = new Object();
    } else {
      b = true;
    }
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true in this context
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
    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true in this context
    }
    return x.hashCode();
  }

  private boolean getCondition() {
    // This method returns a condition that is always false, making the while loop unreachable
    return false;
  }
}