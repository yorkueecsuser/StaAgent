class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    return false;
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }

  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    }

    int value = getValue();
    switch (value) {
      case 1:
        // Some code
        break;
      case 2:
        // Some code
        break;
      default:
        // Some code
        break;
    }

    // Inserting unreachable switch statement
    int unreachableValue = getValue();
    switch (unreachableValue) {
      case 3:
        // This case is unreachable because getValue() always returns 0
        System.out.println("This is an unreachable case.");
        break;
      case 4:
        // This case is also unreachable
        System.out.println("Another unreachable case.");
        break;
    }
  }
}