class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void run() {
    boolean unreachableFlag = getUnreachableFlag();
    if (unreachableFlag) {
      // Unreachable code
      System.out.println("This code is unreachable.");
    } else {
      // This is the original code
      System.out.println("Hello, World!");
    }
  }

  private boolean getUnreachableFlag() {
    return false;
  }
}