class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    boolean shouldRun = getCondition(); // Non-final variable or method call
    if (shouldRun) {
      System.out.println("This condition should never be true!");
    }
    this.start();
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}