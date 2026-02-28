class MyThread extends Thread {
  public void doSomething() {
    System.out.println("Hello, World!");

    // Mutant: Unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is an unreachable print statement.");
    } else {
      System.out.println("This else branch is also unreachable.");
    }
  }

  public boolean getUnreachableCondition() {
    // always return false to make this branch unreachable
    return false;
  }

  public void showBug() {
    this.start(); // This will not print anything as the run method is not overridden
  }
}