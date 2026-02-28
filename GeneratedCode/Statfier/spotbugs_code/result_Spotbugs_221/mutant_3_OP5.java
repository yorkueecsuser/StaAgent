class ConfusingParenting {
  protected int a;

  protected Object b;

  // Method to provide a dynamic condition for the switch statement
  private boolean getDynamicCondition() {
    return false;
  }

  // Method to provide a dynamic value for the switch statement
  private int getDynamicValue() {
    return 0;
  }

  public void someMethod() {
    // Introducing an unreachable switch statement
    boolean condition = getDynamicCondition();
    if (condition) {
      int value = getDynamicValue();
      switch (value) {
        case 1:
          System.out.println("This is case 1");
          break;
        case 2:
          System.out.println("This is case 2");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }
  }
}