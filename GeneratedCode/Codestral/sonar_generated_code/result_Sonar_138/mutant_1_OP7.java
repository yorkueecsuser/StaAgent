class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    this.start();
    boolean loopCondition = false; // Dynamic condition that will make the loop unreachable
    while (loopCondition) {
      System.out.println("This is an unreachable loop!");
    }
  }

  @Override
  public void run() {
    doSomething(); // Call the doSomething method to avoid the original bug
  }
}