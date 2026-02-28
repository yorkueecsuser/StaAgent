class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }
}

class UnreachableWhileLoopMutant extends MyThread { // Mutant
  public void doSomething() {
    System.out.println("Hello, World!");
    while(getCondition()) {} // Unreachable while loop
  }

  private boolean getCondition() {
    return false;
  }
}