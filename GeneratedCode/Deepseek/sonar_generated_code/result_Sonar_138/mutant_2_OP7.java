class MyThread extends Thread { // Noncompliant
  private boolean condition = false;

  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void run() {
    while (getCondition()) { // Unreachable loop (condition is always false)
      doSomething();
    }
  }

  public boolean getCondition() {
    return condition;
  }
}