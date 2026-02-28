import javax.annotation.CheckForNull;

class Ideas_2009_07_26 {
  int x;

  @Override
  public boolean equals(Object obj) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }

    if (obj.getClass()!= Ideas_2009_07_26.class) return false;
    Ideas_2009_07_26 other = (Ideas_2009_07_26) obj;
    if (x!= other.x) return false;
    return true;
  }

  public static int getHash(@CheckForNull Object o) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }

    return o.hashCode();
  }

  public Ideas_2009_07_26(int x) {
    this.x = x;
  }

  @Override
  public int hashCode() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }

    return x;
  }

  private static boolean getCondition() {
    return false;
  }
}