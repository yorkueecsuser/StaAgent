class MyThread extends Thread { // Bug: Classes extending java.lang.Thread should provide a specific "run" behavior
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    this.start(); // This will not print anything as the run method is not overridden
  }
}