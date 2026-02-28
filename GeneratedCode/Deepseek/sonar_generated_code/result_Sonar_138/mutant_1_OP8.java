class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }
}

class MyThread1 extends Thread { // Mutant
  public void doSomething() {
    System.out.println("Hello, New World!");
  }
}