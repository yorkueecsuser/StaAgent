class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
    System.out.println("Hello, World!"); // Mutant: Duplicated assignment statement
  }

  public void showBug() {
    this.start();
  }
}