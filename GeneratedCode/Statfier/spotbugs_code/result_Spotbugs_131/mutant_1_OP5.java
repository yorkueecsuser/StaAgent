abstract class Eq {
  public abstract boolean equals(Eq q);

  // Introduced an unreachable switch statement based on the mutation operator description
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
          System.out.println("Default Case");
          break;
      }
    }

    // Unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition? 0 : 1) {
      case 0:
        System.out.println("This will never be printed");
        break;
      case 1:
        System.out.println("This will always be printed");
        break;
    }
  }

  private boolean getCondition() {
    return true; // This ensures the first switch is reachable
  }

  private int getValue() {
    return 1; // This ensures the first switch is reachable
  }

  private boolean getUnreachableCondition() {
    return false; // This ensures the second switch is unreachable
  }
}