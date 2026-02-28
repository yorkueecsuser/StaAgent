class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");
    System.out.println("Hello, World!"); // Mutated line
  }

  public void showBug() {
    this.start(); // This will print "Hello, World!" twice as the run method is not overridden
  }
}