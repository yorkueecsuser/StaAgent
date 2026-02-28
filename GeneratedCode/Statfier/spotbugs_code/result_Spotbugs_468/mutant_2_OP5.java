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

    // Inserting unreachable switch statement
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
    return false; // This method always returns false, ensuring the switch is unreachable
  }

  private int getUnreachableValue() {
    return 0; // This method returns a value that does not match any case in the switch
  }
}