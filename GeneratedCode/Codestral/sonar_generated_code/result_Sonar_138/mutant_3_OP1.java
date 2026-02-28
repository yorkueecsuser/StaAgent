class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void showBug() {
    int deadStoreVariable; // Added a dead store variable
    this.start();
  }
}