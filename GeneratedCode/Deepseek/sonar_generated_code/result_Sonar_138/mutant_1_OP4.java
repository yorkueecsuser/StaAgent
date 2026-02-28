class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }
  
  public void newMethod() {
    boolean alwaysFalse = false;
    if (alwaysFalse) {
      System.out.println("This statement is always unreachable because the condition is always false.");
    } else {
      System.out.println("This is the alternative code, but it is unreachable as well.");
    }
  }
}