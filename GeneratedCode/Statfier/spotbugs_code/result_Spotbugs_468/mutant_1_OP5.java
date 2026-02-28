import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1678228 {
  @NonNull String str;

  int val;

  public Bug1678228(String str) {
    if (str == null) {
      val = 0;
    } else {
      val = Integer.parseInt(str);
    }
    this.str = str;

    // Inserting unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        val = -1;
        break;
      default:
        // Default case is also unreachable due to the same reason
        val = -2;
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}