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

    // Unreachable switch statement
    if (condition) {
      int unreachableValue = getUnreachableValue();
      switch (unreachableValue) {
        case 1:
          System.out.println("This is unreachable case 1");
          break;
        case 2:
          System.out.println("This is unreachable case 2");
          break;
        default:
          System.out.println("This is unreachable default case");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch statement is unreachable
  }

  private int getUnreachableValue() {
    return 0; // This value does not matter since the switch is unreachable
  }
}