class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void run() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      doSomething();
    } else {
      // Do nothing. The 'else' branch is unreachable.
    }
  }

  private boolean getCondition() {
    return false;
  }
}