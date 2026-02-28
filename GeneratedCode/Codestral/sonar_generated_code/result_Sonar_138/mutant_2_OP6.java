class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  private boolean getCondition() {
    return false;
  }

  public void showBug() {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // insert unreachable for loop
      System.out.println("This loop is unreachable");
    }
    this.start();
  }
}