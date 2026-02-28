import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1678228 {
  @NonNull String str;

  int val;

  public Bug1678228(String str) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }

    if (str == null) {
      val = 0;
    } else {
      val = Integer.parseInt(str);
    }
    this.str = str;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}