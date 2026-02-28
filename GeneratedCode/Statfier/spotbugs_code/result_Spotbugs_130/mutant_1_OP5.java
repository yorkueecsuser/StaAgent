import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadSpellingOfEquals {
  @ExpectWarning("Nm")
  public boolean equal(Object o) {
    return true;
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

    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Some code
    }

    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Some code
    }

    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Alternative code
    }

    int value = getValue();
    switch (value) {
      case 1:
        // Some code
        break;
      default:
        // Default code
        break;
    }

    // Inserting unreachable switch statement
    int unreachableValue = getValue();
    switch (unreachableValue) {
      case 2:
        // This case is unreachable because getValue() always returns 0
        System.out.println("This is an unreachable case.");
        break;
      case 3:
        // Another unreachable case
        System.out.println("This is another unreachable case.");
        break;
    }
  }
}