class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    int unusedVariable;  // Dead store mutation: adding an unused variable
    this.start(); // This will not print anything as the run method is not overridden
  }
}