import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1678228 {
  @NonNull String str;

  int val;

  public Bug1678228(String str) {
    boolean condition = getCondition();
    if (str == null) {
      val = 0;
    } else {
      val = Integer.parseInt(str);
    }
    this.str = str;
    
    // Mutated code: Unreachable if-else statement
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      val = -1;
    } else {
      // This block is also unreachable because the above if condition is always true
      val = -2;
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if-else block is unreachable
    return false;
  }
}