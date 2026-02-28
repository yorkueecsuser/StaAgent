class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public boolean getCondition() { // new method to prevent compile-time errors
    return false;
  }

  public void showBug() {
    this.start();

    // mutant: unreachable while loop
    boolean conditionWhile = this.getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }
}