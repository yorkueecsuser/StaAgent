import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1678228 {
  @NonNull String str;

  int val;

  public Bug1678228(String str) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }

    if (str == null) {
      val = 0;
    } else {
      val = Integer.parseInt(str);
    }
    this.str = str;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}