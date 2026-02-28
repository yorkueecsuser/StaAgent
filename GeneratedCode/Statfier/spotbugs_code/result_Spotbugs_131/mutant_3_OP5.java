abstract class Eq {
  public abstract boolean equals(Eq q);

  // Added mutant code with an unreachable switch statement
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

    // Unreachable switch statement
    boolean unreachableCondition = false; // This is not a compile-time constant in practice
    switch (unreachableCondition? 1 : 0) {
      case 1:
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return true; // Simulate a dynamic condition
  }

  private int getValue() {
    return 1; // Simulate a dynamic value
  }
}