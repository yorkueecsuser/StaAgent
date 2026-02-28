class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
    boolean conditionWhile = false;
    while (conditionWhile) {
      // This is an unreachable statement
    }
  }
}