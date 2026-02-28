class FalseException {
  // This class is not an exception

  // Added mutant code to introduce an unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some logic here
    }

    // Unreachable switch statement
    int unreachableValue = getUnreachableValue();
    switch (unreachableValue) {
      case 1:
        System.out.println("This will never be printed");
        break;
      case 2:
        System.out.println("This will also never be printed");
        break;
      default:
        System.out.println("Default case will never be reached");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the if block is not executed
  }

  private int getUnreachableValue() {
    return 0; // This ensures the switch cases are not executed
  }
}