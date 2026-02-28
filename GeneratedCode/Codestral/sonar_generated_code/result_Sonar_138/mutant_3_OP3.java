class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  private boolean getUnreachableCondition() {
    return false;
  }

  public void showBug() {
    if (getUnreachableCondition()) {
        System.out.println("This line will never be printed.");
    }
    this.start();
  }
}