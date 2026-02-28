class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    this.start();
  }

  public boolean getCondition() {
    // This method will always return false to make the if-else statement unreachable
    return false;
  }

  @Override
  public void run() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This code is unreachable due to the condition being always false
      System.out.println("This line is unreachable.");
    } else {
      doSomething();
    }
  }
}