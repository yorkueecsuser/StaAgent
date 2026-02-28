class MyThread extends Thread { 
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  // Mutation: Unreachable for loop
  public void unreachableForLoop() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Do nothing or add actual code here
    }
  }

  private boolean getCondition() {
    return false; // This can be replaced with any condition which makes the loop unreachable
  }
}