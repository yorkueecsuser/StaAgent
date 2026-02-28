class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    MyThread myThread = new MyThread();
    System.out.println("Hello, World!");
  }
}