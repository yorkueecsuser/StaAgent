class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }
}

class MutatedMyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
    for (int i = 0; false; i++) { 
      // unreachable loop to avoid unreachable statement error
    }
  }
}