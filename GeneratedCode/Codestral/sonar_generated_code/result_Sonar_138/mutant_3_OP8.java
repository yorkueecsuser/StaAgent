class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void d() { // New name for the method "doSomething()"
    System.out.println("Mutated: Hello, World!");
  }

  public void showBug() {
    this.start(); // This will not print anything as the run method is not overridden
  }
}