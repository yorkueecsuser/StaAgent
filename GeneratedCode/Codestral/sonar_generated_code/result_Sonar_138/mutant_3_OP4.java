class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    this.start();

    // Mutated code: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This code is unreachable.");
    } else {
      // This branch is always unreachable, as the condition is always false
      System.out.println("This is the unreachable branch.");
    }
  }

  // Dummy method to simulate runtime condition
  private boolean getCondition() {
    return false;
  }
}