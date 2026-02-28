class MyThread extends Thread {
  public void doSomething() {
    boolean unreachableCondition = false; // Unreachable condition for the mutation
    if (unreachableCondition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    System.out.println("Hello, World!");
  }

  public void showBug() {
    this.start(); // This will not print anything as the run method is not overridden
  }
}