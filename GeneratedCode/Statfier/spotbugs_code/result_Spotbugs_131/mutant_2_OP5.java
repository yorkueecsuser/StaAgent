abstract class Eq {
  public abstract boolean equals(Eq q);

  // Added mutant code with an unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some logic here
    }

    // Unreachable switch statement
    int value = getValue();
    switch (value) {
      case 1:
        // This case is unreachable because getValue() always returns 0
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable for the same reason
        System.out.println("Default case - this will never be printed either");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the if block is not executed
  }

  private int getValue() {
    return 0; // This method ensures the switch statement is unreachable
  }
}