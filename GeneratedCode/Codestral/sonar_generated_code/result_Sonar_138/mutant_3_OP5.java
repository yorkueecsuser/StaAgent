class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    this.start();
    // Mutant code: The switch statement is unreachable because the method 'getCondition()' always returns false.
    boolean condition = getCondition();
    if (condition) {
      int value = getValue();
      switch (value) {
        case 1:
          // This code is unreachable.
          System.out.println("This line should not be executed.");
          break;
      }
    }
  }

  // This method is used to ensure the condition for the if statement is dynamically determined at runtime.
  private boolean getCondition() {
    return false;
  }

  // This method is used to prevent a compile-time error for the switch statement.
  private int getValue() {
    return 0;
  }
}