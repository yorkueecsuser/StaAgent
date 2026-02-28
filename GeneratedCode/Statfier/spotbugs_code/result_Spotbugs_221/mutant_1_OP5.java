class ConfusingParenting {
  protected int a;

  protected Object b;

  // Added mutant code for Unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      int value = getValue();
      switch (value) {
        case 1:
          System.out.println("Case 1");
          break;
        case 2:
          System.out.println("Case 2");
          break;
        default:
          System.out.println("Default case");
      }
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch statement is unreachable
  }

  private int getValue() {
    return 0; // This value does not matter since the condition is false
  }
}