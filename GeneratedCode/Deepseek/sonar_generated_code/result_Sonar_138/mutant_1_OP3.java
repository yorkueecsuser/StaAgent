class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void run() {
    if (false) {
      doSomething();
    }
  }
}