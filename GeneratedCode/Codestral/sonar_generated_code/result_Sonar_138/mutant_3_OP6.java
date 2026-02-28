class MyThread extends Thread {
  private boolean getCondition() {
    return false; // Always returns false to make the loop unreachable
  }

  public void doSomething() {
    System.out.println("Hello, World!");
    for (int i = 0; getCondition(); i++) { /* Unreachable for loop */ }
  }

  public void showBug() {
    this.start();
  }
}